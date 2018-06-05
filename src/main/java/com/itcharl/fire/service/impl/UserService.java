/*
 * Copyright (C) 2006-2016 AiJia All rights reserved
 * Author: Charl
 * Date: 2018/5/15
 * Description:UserService.java
 */
package com.itcharl.fire.service.impl;

import com.itcharl.fire.dao.UserMapper;
import com.itcharl.fire.domain.User;
import com.itcharl.fire.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author Charl
 */
public class UserService implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public int addUser(User user) {
        return userMapper.insert(user);
    }

    @Override
    public int updateUser(User user) {
        return userMapper.updateByPrimaryKeySelective(user);
    }

    @Override
    public List<User> queryAllUser() {
        return userMapper.selectAllUsers();
    }
}
