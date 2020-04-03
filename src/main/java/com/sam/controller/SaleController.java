package com.sam.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sam.pojo.*;
import com.sam.service.SaleDetailService;
import com.sam.service.SaleService;
import com.sam.service.StoreService;
import com.sam.utils.Tool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;

/**
 * @author Sam
 * @date 2020-03-25 17:07
 */
@Controller
@RequestMapping(value = "sale", produces = "application/json; charset=utf-8")
public class SaleController extends BaseController<Sale, SaleExample> {
    @Value("${sale.start}")
    private String start;

    @Value("${sale.end}")
    private String end;

    @Value("${sale.custId}")
    private String custId;

    @Value("${sale.userId}")
    private String userId;

    @Value("${sale.state}")
    private String state;

    /**
     * 数据库中的字段，用于字段排序的选择，定值
     */
    @Value("${setArrayDefault:sale_createtime,sale_sum,sale_state}")
    private String[] arr;

    private SaleService saleService;

    @Autowired
    public void setSaleService(SaleService saleService) {
        this.saleService = saleService;
        this.baseService = saleService;
    }

    @Autowired
    private SaleDetailService saleDetailService;

    @Autowired
    private StoreService storeService;

    /**
     * 销售单添加业务,首先添加销售单,然后添加销售详情
     *
     * @param jsonString 销售单sale,详情列表saleDetailList
     * @return java.lang.String
     */
    @RequestMapping(value = "addSaleAndDetail", produces = "application/json; charset=utf-8")
    @ResponseBody
    @Transactional
    public String addSaleAndDetail(@RequestBody String jsonString) {
        JSONObject jsonObject = JSON.parseObject(jsonString);

        //添加销售单
        Sale sale = JSON.parseObject(jsonObject.getString("sale"), Sale.class);
        saleService.add(sale);

        //添加销售详情
        List<SaleDetail> list = JSON.parseArray(jsonObject.getString("saleDetailList"), SaleDetail.class);
        for (SaleDetail saleDetail : list) {
            saleDetailService.add(saleDetail);
        }

        return "{\"msg\":\"添加成功\"}";
    }

    /**
     * 根据id数组删除销售单以及级联删除详情
     *
     * @param idsJson id数组
     * @return java.lang.String
     */
    @RequestMapping(value = "deleteSaleAndDetail", produces = "application/json; charset=utf-8")
    @ResponseBody
    @Transactional
    public String deleteSaleAndDetail(@RequestBody String idsJson) {
        //获取id集合
        List<Integer> ids = JSON.parseArray(idsJson, Integer.class);

        //删除销售单
        SaleExample saleExample = new SaleExample();
        saleExample.or().andSaleIdIn(ids);
        saleService.deleteByCondition(saleExample);

        return "{\"msg\":\"已成功删除销售单以及详情\"}";
    }

    /**
     * 销售单出库操作,将state状态改为2,同时修改time,更新库存信息
     *
     * @param idJson 主键
     * @return java.lang.String
     */
    @RequestMapping(value = "sell", produces = "application/json; charset=utf-8")
    @ResponseBody
    @Transactional(propagation = Propagation.REQUIRED)
    public String sell(@RequestBody String idJson) {
        //更新销售单中数据,state以及createTime
        Integer id = (Integer) JSON.parse(idJson);
        Sale sale = saleService.selectById(id);

        sale.setSaleState(2);
        sale.setSaleCreatetime(new Date());
        saleService.update(sale);

        //更新库存信息
        //查询销售单详情
        List<SaleDetail> list = sale.getSaleDetailList();

        //更新库存中
        for (SaleDetail saleDetail : list) {
            Integer storeId = saleDetail.getDetaGoodsId();
            Store store = storeService.selectById(storeId);
            store.setRemain(store.getRemain() - saleDetail.getDetaNum());

            //如果库存中对应的商品数大于等于零,更新商品剩余数量
            if (store.getRemain() >= 0) {
                storeService.update(store);
            }else {
                //说明库存不够,抛出异常,事务回滚
                TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
                return "{\"msg\":\"库存不足,出库失败\"}";
            }
        }

        return "{\"msg\":\"该销售单中的商品已经成功出库\"}";
    }

    /**
     * 销售单退货操作,将state状态改为3,同时修改time,并修改库存信息
     *
     * @param idJson 主键
     * @return java.lang.String
     */
    @RequestMapping(value = "back", produces = "application/json; charset=utf-8")
    @ResponseBody
    @Transactional(propagation = Propagation.REQUIRED)
    public String back(@RequestBody String idJson) {
        Integer id = (Integer) JSON.parse(idJson);
        Sale sale = saleService.selectById(id);

        //更新销售单信息
        sale.setSaleState(3);
        sale.setSaleCreatetime(new Date());
        saleService.update(sale);

        //更新库存信息
        //查询销售单详情
        List<SaleDetail> list = sale.getSaleDetailList();

        //更新库存商品数量
        for (SaleDetail saleDetail : list) {
            Store store = storeService.selectById(saleDetail.getDetaGoodsId());

            store.setRemain(store.getRemain() + saleDetail.getDetaNum());
            storeService.update(store);
        }

        return "{\"msg\":\"成功完成销售退货操作\"}";
    }

    /**
     * 条件查询并分页
     *
     * @param json 前台数据json字符串，包含pageSize，pageNum，startTime，endTime，custId，userId，state
     * @return java.lang.String
     */
    @RequestMapping(value = "selectByPage", produces = "application/json; charset=utf-8")
    @ResponseBody
    public String selectByPage(@RequestBody String json) {
        SaleExample condition = new SaleExample();
        SaleExample.Criteria criteria = condition.createCriteria();

        //解析json，并进行条件插入
        JSONObject jsonObject = JSON.parseObject(json);

        //进行字段排序
        condition.setOrderByClause(Tool.orderByClause(jsonObject, order, clause, arr));

        //最早日期
        if (jsonObject.containsKey(start)) {
            criteria.andSaleCreatetimeGreaterThanOrEqualTo(jsonObject.getDate(start));
        }

        //最晚日期
        if (jsonObject.containsKey(end)) {
            criteria.andSaleCreatetimeLessThanOrEqualTo(jsonObject.getDate(end));
        }

        //suppId查询
        if (jsonObject.containsKey(custId)) {
            criteria.andSaleCustIdEqualTo(jsonObject.getIntValue(custId));
        }

        //userId查询
        if (jsonObject.containsKey(userId)) {
            criteria.andSaleUserIdEqualTo(jsonObject.getIntValue(userId));
        }

        //state查询
        if (jsonObject.containsKey(state)) {
            criteria.andSaleStateEqualTo(jsonObject.getIntValue(state));
        }

        PageHelper.startPage(jsonObject.getIntValue(pageNum), jsonObject.getIntValue(pageSize));
        List<Sale> list = saleService.selectByCondition(condition);
        Page<Sale> res = new Page<>(new PageInfo<>(list));

        return JSON.toJSONString(res);
    }
}
