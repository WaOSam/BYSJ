package com.sam.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sam.pojo.Page;
import com.sam.pojo.Supplier;
import com.sam.pojo.SupplierExample;
import com.sam.service.SupplierService;
import com.sam.utils.Tool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author Sam_T
 * @date 2020-03-25 17:08
 */
@Controller
@RequestMapping(value = "supplier", produces = "application/json; charset=utf-8")
public class SupplierController extends BaseController<Supplier, SupplierExample> {
    @Value("${supplier.name}")
    private String name;

    @Value("${supplier.address}")
    private String address;

    @Value("${supplier.phone}")
    private String phone;

    @Value("${supplier.bank}")
    private String bank;

    /**
     * 数据库中的字段，用于字段排序的选择，定值
     */
    @Value("${setArrayDefault:supp_name,supp_address,supp_phone,supp_bank}")
    private String[] arr;

    private SupplierService supplierService;

    @Autowired
    public void setSupplierService(SupplierService supplierService) {
        this.supplierService = supplierService;
        this.baseService = supplierService;
    }

    /**
     * 条件查询并分页
     *
     * @param json 前台数据json字符串，包含pageSize，pageNum，suppName，suppAddress，suppPhone，suppBank
     * @return java.lang.String
     */
    @RequestMapping(value = "selectByPage", produces = "application/json; charset=utf-8")
    @ResponseBody
    public String selectByPage(@RequestBody String json) {
        SupplierExample condition = new SupplierExample();
        SupplierExample.Criteria criteria = condition.createCriteria();

        //解析json，并进行条件插入
        JSONObject jsonObject = JSON.parseObject(json);

        //进行字段排序
        condition.setOrderByClause(Tool.orderByClause(jsonObject, order, clause, arr));

        //姓名模糊查询
        if (jsonObject.containsKey(name)) {
            criteria.andSuppNameLike("%" + jsonObject.getString(name) + "%");
        }

        //地址模糊查询
        if (jsonObject.containsKey(address)) {
            criteria.andSuppAddressLike("%" + jsonObject.getString(address) + "%");
        }

        //电话模糊查询
        if (jsonObject.containsKey(phone)) {
            criteria.andSuppPhoneLike("%" + jsonObject.getString(phone) + "%");
        }

        //银行模糊查询
        if (jsonObject.containsKey(bank)) {
            criteria.andSuppBankLike("%" + jsonObject.getString(bank) + "%");
        }

        PageHelper.startPage(jsonObject.getIntValue(pageNum), jsonObject.getIntValue(pageSize));
        List<Supplier> list = supplierService.selectByCondition(condition);
        Page<Supplier> res = new Page<>(new PageInfo<>(list));

        return JSON.toJSONString(res);
    }
}
