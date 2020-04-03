package com.sam.utils;

import com.alibaba.fastjson.JSONObject;

/**
 * springboot_jxc
 * 抽取重复的代码片段
 *
 * @author Sam_T
 * @date 2020-03-29 01:22
 */
public class Tool {
    /**
     * 返回字段排序的参数
     *
     * @param jsonObject 解析后的json对象
     * @param order 排序升降
     * @param clause 排序字段
     * @param arr 字段数组
     * @return java.lang.String
     */
    public static String orderByClause(JSONObject jsonObject, String order, String clause, String[] arr){
        //编辑字段排序字符串  字段名 asc|desc
        //设置排序升降，默认升序
        String orderByClause = jsonObject.containsKey(order) ? jsonObject.getString(order) : "asc";
        //默认按照第一个字段排序
        orderByClause = arr[jsonObject.containsKey(clause)? jsonObject.getIntValue(clause) : 0] + " " + orderByClause;

        return orderByClause;
    }
}
