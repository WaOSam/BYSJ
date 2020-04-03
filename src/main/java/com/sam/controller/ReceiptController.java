package com.sam.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sam.pojo.*;
import com.sam.service.ReceDetailService;
import com.sam.service.ReceiptService;
import com.sam.service.StoreService;
import com.sam.utils.Tool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;

/**
 *@Author: Same_T
 *@date: 2020-03-26 16:51:43
 *@Description:
 */
@Controller
@RequestMapping(value = "receipt", produces = "application/json; charset=utf-8")
public class ReceiptController extends BaseController<Receipt, ReceiptExample> {
    @Value("${receipt.start}")
    private String start;

    @Value("${receipt.end}")
    private String end;

    @Value("${receipt.suppId}")
    private String suppId;

    @Value("${receipt.userId}")
    private String userId;

    @Value("${receipt.state}")
    private String state;

    /**
     * 数据库中的字段，用于字段排序的选择，定值
     */
    @Value("${setArrayDefault:rece_createtime,rece_sum,rece_state}")
    private String[] arr;

    private ReceiptService receiptService;

    @Autowired
    public void setReceiptService(ReceiptService receiptService) {
        this.receiptService = receiptService;
        this.baseService = receiptService;
    }

    @Autowired
    private ReceDetailService receDetailService;

    @Autowired
    private StoreService storeService;

    /**
     * 进货单添加业务，首先添加进货单，然后添加进货详情
     *
     * @param jsonString 进货单（receipt）数据以及进货单详情列表（receDetailList）
     * @return java.lang.String
     */
    @RequestMapping(value = "addReceiptAndDetail", produces = "application/json; charset=utf-8")
    @ResponseBody
    @Transactional
    public String addReceiptAndDetail(@RequestBody String jsonString) {
        JSONObject jsonObject = JSON.parseObject(jsonString);

        Receipt receipt = JSON.parseObject(jsonObject.getString("receipt"), Receipt.class);
        receiptService.add(receipt);

        List<ReceDetail> list = JSON.parseArray(jsonObject.getString("receDetailList"), ReceDetail.class);

        for (ReceDetail receDetail : list) {
            receDetailService.add(receDetail);
        }

        return "{\"msg\":\"添加成功\"}";
    }

    /**
     * 根据id数组进行删除进货单并级联删除详情
     * 
     * @param idsJson id数组
     * @return java.lang.String
     */
    @RequestMapping(value = "deleteReceiptAndDetail", produces = "application/json; charset=utf-8")
    @ResponseBody
    @Transactional
    public String deleteReceiptAndDetail(@RequestBody String idsJson){
        //获取id集合
        List<Integer> ids = JSON.parseArray(idsJson, Integer.class);

        //删除进货单
        ReceiptExample receiptExample = new ReceiptExample();
        receiptExample.or().andReceIdIn(ids);
        receiptService.deleteByCondition(receiptExample);

        return "{\"msg\":\"已成功删除进货单以及详情\"}";
    }

    /**
     * 进货单进货操作，将state状态改为2,同时修改time.然后生成相应的库存
     *
     * @param idJson 主键
     * @return java.lang.String
     */
    @RequestMapping(value = "put", produces = "application/json; charset=utf-8")
    @ResponseBody
    @Transactional
    public String put(@RequestBody String idJson){
        //更改进货单中的数据,state以及createTime
        Integer id = (Integer) JSON.parse(idJson);
        Receipt receipt = receiptService.selectById(id);

        receipt.setReceState(2);
        receipt.setReceCreatetime(new Date());
        receiptService.update(receipt);

        //添加库存
        //查询出进货单详情
        List<ReceDetail> list = receipt.getReceDetailList();

        //新增库存
        for (ReceDetail receDetail : list) {
            Store store = new Store(receDetail, receipt);
            storeService.add(store);
        }

        return "{\"msg\":\"该进货单中的商品已经成功入库\"}";
    }

    /**
     * 进货单退货操作，将state状态改为3,同时修改time
     *
     * @param idJson 主键
     * @return java.lang.String
     */
    @RequestMapping(value = "out", produces = "application/json; charset=utf-8")
    @ResponseBody
    public String out(@RequestBody String idJson){
        try {
            Integer id = (Integer) JSON.parse(idJson);
            Receipt receipt = receiptService.selectById(id);

            receipt.setReceState(3);
            receipt.setReceCreatetime(new Date());
            receiptService.update(receipt);
            return "{\"msg\":\"成功完成进货退货操作\"}";
        } catch (Exception e) {
            e.printStackTrace();
            return "{\"msg\":\"发生错误，退货失败\"}";
        }
    }

    /**
     * 条件查询并分页
     *
     * @param json 前台数据json字符串，包含pageSize，pageNum，startTime，endTime，suppId，userId，state
     * @return java.lang.String
     */
    @RequestMapping(value = "selectByPage", produces = "application/json; charset=utf-8")
    @ResponseBody
    public String selectByPage(@RequestBody String json) {
        ReceiptExample condition = new ReceiptExample();
        ReceiptExample.Criteria criteria = condition.createCriteria();

        //解析json，并进行条件插入
        JSONObject jsonObject = JSON.parseObject(json);

        //进行字段排序
        condition.setOrderByClause(Tool.orderByClause(jsonObject, order, clause, arr));

        //最早日期
        if (jsonObject.containsKey(start)) {
            criteria.andReceCreatetimeGreaterThanOrEqualTo(jsonObject.getDate(start));
        }

        //最晚日期
        if (jsonObject.containsKey(end)) {
            criteria.andReceCreatetimeLessThanOrEqualTo(jsonObject.getDate(end));
        }

        //suppId查询
        if (jsonObject.containsKey(suppId)) {
            criteria.andReceSuppIdEqualTo(jsonObject.getIntValue(suppId));
        }

        //userId查询
        if (jsonObject.containsKey(userId)) {
            criteria.andReceUserIdEqualTo(jsonObject.getIntValue(userId));
        }

        //state查询
        if (jsonObject.containsKey(state)) {
            criteria.andReceStateEqualTo(jsonObject.getIntValue(state));
        }

        PageHelper.startPage(jsonObject.getIntValue(pageNum), jsonObject.getIntValue(pageSize));
        List<Receipt> list = receiptService.selectByCondition(condition);
        Page<Receipt> res = new Page<>(new PageInfo<>(list));

        return JSON.toJSONString(res);
    }
}