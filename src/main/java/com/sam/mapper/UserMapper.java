package com.sam.mapper;

import com.sam.pojo.User;
import com.sam.pojo.UserExample;

/**
 * @author Sam
 * @date 2020-03-24 12:19
 */
public interface UserMapper extends BaseMapper<User, UserExample> {
    /**
     * 为了登录查询所有，包括密码
     * 
     * @param account 用户账号
     * @return com.sam.pojo.User
     */
    User login(Integer account);
}
