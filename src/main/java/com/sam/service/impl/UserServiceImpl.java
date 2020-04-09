package com.sam.service.impl;

import com.sam.mapper.UserMapper;
import com.sam.pojo.User;
import com.sam.pojo.UserExample;
import com.sam.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Sam
 * @date 2020-03-24 12:30
 */
@Service
public class UserServiceImpl extends BaseServiceImpl<User, UserExample> implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User login(Integer account) {
        return userMapper.login(account);
    }

    @Override
    public Integer update(User user) {
        return mapper.updateByPrimaryKeySelective(user);
    }
}
