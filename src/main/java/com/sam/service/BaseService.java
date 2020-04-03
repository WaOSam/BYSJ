package com.sam.service;

import java.util.List;

/**
 * baseService基本增删改查功能
 * @author Sam_T
 */
public interface BaseService<E,T> {
    /**
     * 新增记录
     * @param entity 实体对象
     * @return java.lang.Integer
     */
    Integer add(E entity);


    /**
     * 条件删除记录
     * @param condition XXXExample条件对象
     * @return java.lang.Integer
     */
    Integer deleteByCondition(T condition);

    /**
     * 根据主键删除记录
     *
     * @param id 主键
     * @return java.lang.Integer
     */
    Integer deleteById(Integer id);

    /**
     * 更新单个记录全部数据
     * @param entity 实体对象
     * @return java.lang.Integer
     */
    Integer update(E entity);

    /**
     * 根据主键查询记录
     * @param id 主键
     * @return E
     */
    E selectById(Integer id);

    /**
     * 条件查询
     * @param condition XXXExample条件对象
     * @return java.util.List<E>
     */
    List<E> selectByCondition(T condition);
}
