package com.sam.service.impl;

import com.sam.mapper.BaseMapper;
import com.sam.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author  Sam_T
 * 描述 实现基本增删改查
 * 日期 2020-03-24 11:14
 */
public class BaseServiceImpl<E,T> implements BaseService<E,T> {
    @Autowired
    protected BaseMapper<E,T> mapper;

    @Override
    public Integer add(E entity) {
        return mapper.insertSelective(entity);
    }

    @Override
    public Integer deleteByCondition(T condition) {
        return mapper.deleteByExample(condition);
    }

    @Override
    public Integer deleteById(Integer id) {
        return mapper.deleteByPrimaryKey(id);
    }

    @Override
    public Integer update(E entity) {
        return mapper.updateByPrimaryKey(entity);
    }

    @Override
    public E selectById(Integer id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public List<E> selectByCondition(T condition) {
        return mapper.selectByExample(condition);
    }
}
