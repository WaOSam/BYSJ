package com.sam.service;

import com.sam.pojo.User;
import com.sam.pojo.UserExample;

/**
 * @author Sam
 * @date 2020-03-24 12:22
 */
public interface UserService extends BaseService<User, UserExample> {
    /**
     * 登录查询，包括密码
     *
     * @param account 用户账号
     * @return com.sam.pojo.User
     */
    User login(Integer account);
}
