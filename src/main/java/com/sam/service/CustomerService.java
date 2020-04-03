package com.sam.service;

import com.sam.pojo.Customer;
import com.sam.pojo.CustomerExample;

import java.util.List;

/*
 * 作者 Sam_T
 * 描述 customerservice接口
 * 日期 2020/3/23
 **/
public interface CustomerService extends BaseService<Customer, CustomerExample> {
    public Integer count();

    public List<Customer> queryExample();
}
