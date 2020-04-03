package com.sam.service.impl;

import com.sam.mapper.SupplierMapper;
import com.sam.pojo.Supplier;
import com.sam.pojo.SupplierExample;
import com.sam.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Sam
 * @date 2020-03-25 16:57
 */
@Service
public class SupplierServiceImpl extends BaseServiceImpl<Supplier, SupplierExample> implements SupplierService {
}
