package com.sam.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sam.pojo.Customer;
import com.sam.pojo.CustomerExample;
import com.sam.pojo.Page;
import com.sam.service.CustomerService;
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
 * @date: 2020-03-26 15:22:30
 * @Description: 实现customer业务
 */
@Controller
@RequestMapping(value = "customer", produces = "application/json; charset=utf-8")
public class CustomerController extends BaseController<Customer, CustomerExample> {
    @Value("${customer.name}")
    private String name;

    @Value("${customer.address}")
    private String address;

    @Value("${customer.phone}")
    private String phone;

    @Value("${customer.bank}")
    private String bank;

    /**
     * 数据库中的字段，用于字段排序的选择，定值
     */
    @Value("${setArrayDefault:cust_name,cust_address,cust_phone,cust_bank}")
    private String[] arr;

    private CustomerService customerService;

    @Autowired
    public void setCustomerService(CustomerService customerService) {
        this.customerService = customerService;
        this.baseService = customerService;
    }

    /**
     * 条件查询并分页
     *
     * @param json 前台数据json字符串，包含pageSize，pageNum，custName，custAddress，custPhone，custBank
     * @return java.lang.String
     */
    @RequestMapping(value = "selectByPage", produces = "application/json; charset=utf-8")
    @ResponseBody
    public String selectByPage(@RequestBody String json) {
        CustomerExample condition = new CustomerExample();
        CustomerExample.Criteria criteria = condition.createCriteria();

        //解析json，并进行条件插入
        JSONObject jsonObject = JSON.parseObject(json);

        //进行字段排序
        condition.setOrderByClause(Tool.orderByClause(jsonObject, order, clause, arr));

        //姓名模糊查询
        if (jsonObject.containsKey(name)) {
            criteria.andCustNameLike("%" + jsonObject.getString(name) + "%");
        }

        //地址模糊查询
        if (jsonObject.containsKey(address)) {
            criteria.andCustAddressLike("%" + jsonObject.getString(address) + "%");
        }

        //电话模糊查询
        if (jsonObject.containsKey(phone)) {
            criteria.andCustPhoneLike("%" + jsonObject.getString(phone) + "%");
        }

        //银行模糊查询
        if (jsonObject.containsKey(bank)) {
            criteria.andCustBankLike("%" + jsonObject.getString(bank) + "%");
        }

        PageHelper.startPage(jsonObject.getIntValue(pageNum), jsonObject.getIntValue(pageSize));
        List<Customer> list = customerService.selectByCondition(condition);
        Page<Customer> res = new Page<>(new PageInfo<>(list));

        return JSON.toJSONString(res);
    }
}
