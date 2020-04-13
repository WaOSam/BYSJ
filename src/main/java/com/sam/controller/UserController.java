package com.sam.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sam.pojo.Page;
import com.sam.pojo.User;
import com.sam.pojo.UserExample;
import com.sam.service.UserService;
import com.sam.utils.Tool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author Sam_T
 * @date 2020-03-25 17:09
 */
@Controller
@RequestMapping(value = "user", produces = "application/json; charset=utf-8")
public class UserController extends BaseController<User, UserExample> {
    @Value("${user.name}")
    private String name;

    @Value("${user.gender}")
    private String gender;

    /**
     * 数据库中的字段，用于字段排序的选择，定值
     */
    @Value("${setArrayDefault:user_name,user_phone,user_gender}")
    private String[] arr;

    private UserService userService;

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
        this.baseService = userService;
    }

    /**
     * 条件查询
     *
     * @param json 前台数据json字符串，包含pageSize，pageNum，goodsName，goodsPlace
     * @return java.lang.String
     */
    @RequestMapping(value = "selectByPage", produces = "application/json; charset=utf-8")
    @ResponseBody
    public String selectByPage(@RequestBody String json) {
        UserExample condition = new UserExample();
        UserExample.Criteria criteria = condition.createCriteria();

        //解析json并使用
        JSONObject jsonObject = JSON.parseObject(json);

        //进行字段排序
        condition.setOrderByClause(Tool.orderByClause(jsonObject, order, clause, arr));

//        搜索的对象全为员工
        criteria.andUserTypeEqualTo(1);

        //姓名模糊查询
        if (jsonObject.containsKey(name)) {
            criteria.andUserNameLike("%" + jsonObject.getString(name) + "%");
        }

        //姓名模糊查询
        if (jsonObject.containsKey(gender)) {
            criteria.andUserGenderEqualTo(jsonObject.getInteger(gender));
        }

        PageHelper.startPage(jsonObject.getIntValue(pageNum), jsonObject.getIntValue(pageSize));
        List<User> list = baseService.selectByCondition(condition);
        Page<User> res = new Page<>(new PageInfo<>(list));

        return JSON.toJSONString(res);
    }

    /**
     * 修改用户密码，需要验证原密码
     *
     * @param json 包含用户账号，旧密码，新密码json字符串
     * @return java.lang.String
     */
    @RequestMapping("changePassword")
    @ResponseBody
    public String changePassword(@RequestBody String json) {
        //解析json并使用
        JSONObject jsonObject = JSON.parseObject(json);

        //用户账号，原密码，新密码
        Integer userAccount = jsonObject.getInteger("userAccount");
        String oldPassword = jsonObject.getString("oldPassword");
        String newPassword = jsonObject.getString("newPassword");

        //查询用户所有信息，并验证原密码是否正确
        User user = userService.login(userAccount);

        //用于返回的json对象
        JSONObject res = new JSONObject();
        //密码错误，返回错误提示
        if (!user.getUserPassword().equals(oldPassword)) {
            res.put("msg", "原密码错误，更改失败！");
            res.put("change", false);
        } else {
            user.setUserPassword(newPassword);
            userService.update(user);
            res.put("msg", "密码更改完成！");
            res.put("change", true);
        }

        return JSON.toJSONString(res);
    }

    /**
     * 根据主键数组重置密码
     *
     * @param ids 前端主键数组json字符化
     * @return java.lang.String
     */
    @RequestMapping("reset")
    @ResponseBody
    public String reset(@RequestBody String ids) {
        //用于返回的json对象
        JSONObject res = new JSONObject();

        try {
            JSONArray array = JSON.parseArray(ids);
            for (Object id : array) {
                User user = new User();
                user.setUserAccount((Integer)id);
                user.setUserPassword("000000");

                userService.update(user);
            }

            res.put("msg", "密码重置成功！");
            res.put("reset", true);
            return JSON.toJSONString(res);
        } catch (Exception e) {
            e.printStackTrace();

            // 事务回滚
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            res.put("msg", "发生错误，密码重置失败!");
            res.put("reset", false);
            return JSON.toJSONString(res);
        }
    }
}
