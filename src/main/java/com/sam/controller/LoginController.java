package com.sam.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.sam.pojo.User;
import com.sam.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * springboot_jxc
 * 登录controller
 *
 * @author Sam_T
 * @date 2020-04-01 21:00
 */
@Controller
public class LoginController {
    @Autowired
    private UserService userService;

    /**
     * 登录验证，如果登录成功，添加session等信息，否则提示重新登录
     *
     * @param json 登录参数，账号(account)，密码(password)
     * @return java.lang.String
     */
    @RequestMapping(value = "login", produces = "text/plain;charset=UTF-8")
    @ResponseBody
    public String login(@RequestBody String json, HttpSession session) {
        //返回的结果，设置login，msg数据
        JSONObject res = new JSONObject();

        JSONObject jsonObject = JSON.parseObject(json);
        //获取账号以及密码
        Integer account = jsonObject.getInteger("account");
        String password = jsonObject.getString("password");

        //根据用户账号查询
        User user = userService.login(account);

        //不存在该用户
        if (user == null) {
            res.put("login", false);
            res.put("msg", "不存在该用户，请重新登陆！");
            return JSON.toJSONString(res);
        }

        //用户存在，但密码不正确
        if (!user.getUserPassword().equals(password)) {
            res.put("login", false);
            res.put("msg", "用户密码错误，请重新登录！");
            return JSON.toJSONString(res);
        }

        //用户登录成功
        user.setUserPassword(null);
        //将用户信息等返回
        res.put("user", user);
        res.put("login", true);
        session.setAttribute("userName", user.getUserName());

        return JSON.toJSONString(res);
    }
}
