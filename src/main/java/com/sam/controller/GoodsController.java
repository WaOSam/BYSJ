package com.sam.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sam.pojo.Goods;
import com.sam.pojo.GoodsExample;
import com.sam.pojo.Page;
import com.sam.service.GoodsService;
import com.sam.utils.Tool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Author: Same_T
 * @date: 2020-03-26 15:21:45
 * @Description: 实现goods业务
 */
@Controller
@RequestMapping(value = "goods", produces = "application/json; charset=utf-8")
public class GoodsController extends BaseController<Goods, GoodsExample> {
    @Value("${goods.name}")
    private String name;

    @Value("${goods.place}")
    private String place;

    /**
     * 数据库中的字段，用于字段排序的选择，定值
     */
    @Value("${setArrayDefault:goods_name,goods_place}")
    private String[] arr;

    private GoodsService goodsService;

    @Autowired
    public void setGoodsService(GoodsService goodsService) {
        this.goodsService = goodsService;
        this.baseService = goodsService;
    }

    /**
     * 条件查询
     *
     * @param json 前台数据json字符串，包含pageSize，pageNum，goodsName，goodsPlace
     * @return java.lang.String
     */
    @RequestMapping(value = "selectByPage", produces = "application/json; charset=utf-8")
    @ResponseBody
    public String selectByPage(@RequestBody String json) {
        GoodsExample condition = new GoodsExample();
        GoodsExample.Criteria criteria = condition.createCriteria();

        //解析json并使用
        JSONObject jsonObject = JSON.parseObject(json);

        //进行字段排序
        condition.setOrderByClause(Tool.orderByClause(jsonObject, order, clause, arr));

        //姓名模糊查询
        if (jsonObject.containsKey(name)) {
            criteria.andGoodsNameLike("%" + jsonObject.getString(name) + "%");
        }

        //地址模糊查询
        if (jsonObject.containsKey(name)) {
            criteria.andGoodsPlaceLike("%" + jsonObject.getString(place) + "%");
        }

        PageHelper.startPage(jsonObject.getIntValue(pageNum), jsonObject.getIntValue(pageSize));
        List<Goods> list = goodsService.selectByCondition(condition);
        Page<Goods> res = new Page<>(new PageInfo<>(list));

        return JSON.toJSONString(res);
    }
}
