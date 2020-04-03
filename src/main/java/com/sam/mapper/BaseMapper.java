package com.sam.mapper;

import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author Same_T
 * @date 2020-03-26 21:59:08
 * example限制所筛选的行
 * selective限制列中含有值的属性（列）
 */
public interface BaseMapper<E, T> {

    /**
     * 新增记录所有列
     * @param record 新增的数据
     * @return int
     */
    int insert(E record);

    /**
     * 新增记录中有值列
     * @param record 限定新增列以及新增的数据
     * @return int
     */
    int insertSelective(E record);

    /**
     * 根据主键删除
     * @param custId 主键
     * @return int
     */
    int deleteByPrimaryKey(Integer custId);

    /**
     * 根据条件删除记录
     * @param example 条件模型
     * @return int
     */
    int deleteByExample(T example);

    /**
     * 根据主键更新有值列
     * 更新单个记录部分数据
     * @param record 限定更新列以及更新的数据
     * @return int
     */
    int updateByPrimaryKeySelective(E record);

    /**
     * 根据主键更新所有列
     * 更新单个记录所有数据
     * @param record
     * @return int
     */
    int updateByPrimaryKey(E record);

    /**
     * 根据条件更新记录中的有值列
     * 更新指定记录部分数据
     * @param record 限定更新列以及更新的数据
     * @param example 条件模型
     * @return int
     */
    int updateByExampleSelective(@Param("record") E record, @Param("example") T example);

    /**
     * 根据条件更新所有列
     * 更新指定记录所有数据，使用场景少
     * @param record 更新的数据
     * @param example 条件模型
     * @return int
     */
    int updateByExample(@Param("record") E record, @Param("example") T example);

    /**
     * 根据条件查询结果集
     * @param example 条件模型
     * @return java.util.List<E>
     */
    List<E> selectByExample(T example);

    /**
     * 根据主键查询
     * @param custId 主键
     * @return E
     */
    E selectByPrimaryKey(Integer custId);

    /**
     * 根据条件查询结果数
     * @param example 条件模型
     * @return int
     */
    int countByExample(T example);
}
