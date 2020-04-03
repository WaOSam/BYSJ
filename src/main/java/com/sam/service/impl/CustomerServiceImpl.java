package com.sam.service.impl;

import com.sam.pojo.Customer;
import com.sam.pojo.CustomerExample;
import com.sam.service.CustomerService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 作者 Sam_T
 * 描述 customerservice实现
 * 日期 2020-03-23 15:55
 */
@Service
public class CustomerServiceImpl extends BaseServiceImpl<Customer, CustomerExample> implements CustomerService {
    @Override
    public Integer count(){
        CustomerExample example = new CustomerExample();
        example.or().andCustBankLike("%银行%");
        return mapper.countByExample(example);
    }

    @Override
    public List<Customer> queryExample() {
        CustomerExample example = new CustomerExample();
        example.or().andCustBankLike("%银行%").andCustNameLike("%子%");

        return mapper.selectByExample(example);
    }
}
