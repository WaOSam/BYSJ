package com.sam.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sam.pojo.Page;
import com.sam.pojo.Store;
import com.sam.pojo.StoreExample;
import com.sam.service.StoreService;
import com.sam.utils.Tool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 * springboot_jxc
 * 库存controller
 *
 * @author Sam_T
 * @date 2020-03-30 14:34
 */
@Controller
@RequestMapping(value = "store", produces = "application/json; charset=utf-8")
public class StoreController extends BaseController<Store, StoreExample>{
    private final long DAY = 1000 * 60 * 60 * 24;

    @Value("${store.remain}")
    private String remain;

    @Value("${store.receId}")
    private String receId;

    @Value("${store.goodsId}")
    private String goodsId;

    @Value("${store.start}")
    private String start;

    @Value("${store.end}")
    private String end;
    /**
     * 数据库中的字段，用于字段排序的选择，定值
     */
    @Value("${setArrayDefault:rece_id,rece_num,fresh,remain}")
    private String[] arr;

    private StoreService storeService;

    @Autowired
    public void setStoreService(StoreService storeService) {
        this.storeService = storeService;
        this.baseService = storeService;
    }

    /**
     * 条件查询并分页
     *
     * @param json 前台数据json字符串，包含pageSize，pageNum，remain，receId，goodsId，startTime，endTime
     * @return java.lang.String
     */
    @RequestMapping(value = "selectByPage", produces = "application/json; charset=utf-8")
    @ResponseBody
    public String selectByPage(@RequestBody String json) {
        StoreExample condition = new StoreExample();
        StoreExample.Criteria criteria = condition.createCriteria();

        //解析json，并进行条件插入
        JSONObject jsonObject = JSON.parseObject(json);

        //进行字段排序
        condition.setOrderByClause(Tool.orderByClause(jsonObject, order, clause, arr));

        //最早日期
        if (jsonObject.containsKey(start)) {
            criteria.andFreshGreaterThanOrEqualTo(jsonObject.getDate(start));
        }

        //最晚日期
        if (jsonObject.containsKey(end)) {
            criteria.andFreshLessThanOrEqualTo(jsonObject.getDate(end));
        }

        //receId查询
        if (jsonObject.containsKey(receId)) {
            criteria.andReceIdEqualTo(jsonObject.getIntValue(receId));
        }

        //goodsId查询
        if (jsonObject.containsKey(goodsId)) {
            criteria.andGoodsIdEqualTo(jsonObject.getIntValue(goodsId));
        }

        //remain查询,大于
        if (jsonObject.containsKey(remain)) {
            criteria.andRemainGreaterThan(jsonObject.getIntValue(remain));
        }

        PageHelper.startPage(jsonObject.getIntValue(pageNum), jsonObject.getIntValue(pageSize));
        List<Store> list = storeService.selectByCondition(condition);
        Page<Store> res = new Page<>(new PageInfo<>(list));

        return JSON.toJSONString(res);
    }

    /**
     * 商品过期预警，根据保质期，以及预警天数查询出快过期的商品
     *
     * @return java.lang.String
     */
    @RequestMapping(value = "warn", produces = "application/json; charset=utf-8")
    @ResponseBody
    public String warn(){
        //遍历所有库存数量不为零的商品
        StoreExample storeExample = new StoreExample();
        storeExample.or().andRemainGreaterThan(0);
        List<Store> stores = storeService.selectByCondition(storeExample);

        Date now = new Date();
        List<Store> list = new LinkedList<>();
        //查询进入预警的商品
        for (Store store : stores) {
            Date fresh = store.getFresh();
            Integer warn = store.getGoodsWarn();

            //检测进入预警的商品
            if(fresh.getTime() - now.getTime() <= warn * DAY ){
                list.add(store);
            }
        }

        return JSON.toJSONString(list);
    }
}
