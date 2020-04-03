package com.sam.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.sam.service.BaseService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: Same_T
 * @date: 2020-03-26 15:21:25
 * @Description: 编写抽取controller
 */
public class BaseController<E, T> {
    @Value("${page.size}")
    protected String pageSize;

    @Value("${page.num}")
    protected String pageNum;

    @Value("${page.order}")
    protected String order;

    @Value("${page.clause}")
    protected String clause;

    /**
     * baseService泛型，在具体controller实现时再赋值
     */
    protected BaseService<E, T> baseService;

    /**
     * 值为null，只用于声明对应的XXExample，从而查询全部结果集(只在selectAllByPage中使用)
     */
    private T t;

    /**
     * 接受json字符串，利用@RequestBody封装成实体类，进行记录新增
     * 但注意date类型传来时为XXXX（距离元年的毫秒差），而不是年月日形式
     *
     * @param e 前台传来的json字符串被@RequestBody封装成对应的对象
     * @return java.lang.String
     */
    @RequestMapping("add")
    @ResponseBody
    public String add(@RequestBody E e) {
        try {
            baseService.add(e);
            return "{\"msg\":\"添加成功\"}";
        } catch (Exception ex) {
            ex.printStackTrace();
            return "{\"msg\":\"发生错误，添加失败\"}";
        }
    }

    /**
     * 根据主键数组删除记录
     *
     * @param ids 前端主键数组json字符化
     * @return java.lang.String
     */
    @RequestMapping("delete")
    @ResponseBody
    public String delete(@RequestBody String ids) {
        try {
            JSONArray array = JSON.parseArray(ids);
            for (Object id : array) {
                baseService.deleteById((Integer) id);
            }

            return "{\"msg\":\"删除成功\"}";
        } catch (Exception e) {
            e.printStackTrace();
            return "{\"msg\":\"发生错误，删除失败\"}";
        }
    }

    /**
     * 接受json字符串，封装成实体对象，进行记录更新
     *
     * @param e 实体对象
     * @return java.lang.String
     */
    @RequestMapping("update")
    @ResponseBody
    public String update(@RequestBody E e) {
        try {
            baseService.update(e);
            return "{\"msg\":\"更新成功\"}";
        } catch (Exception ex) {
            ex.printStackTrace();
            return "{\"msg\":\"发生错误，更新失败\"}";
        }
    }

    /**
     * 根据主键查询
     *
     * @param id 主键
     * @return java.lang.String
     */
    @RequestMapping("selectById")
    @ResponseBody
    public String selectById(@RequestBody String id) {
        Integer key = (Integer) JSON.parse(id);

        return JSON.toJSONString(baseService.selectById(key));
    }
}
