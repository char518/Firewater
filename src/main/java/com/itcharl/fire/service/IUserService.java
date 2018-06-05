/*
 * Copyright (C) 2006-2016 AiJia All rights reserved
 * Author: Charl
 * Date: 2018/5/15
 * Description:IUserService.java
 */
package com.itcharl.fire.service;

import com.itcharl.fire.domain.User;

import java.util.List;

/**
 * @author Charl
 */
public interface IUserService {
    
    int addUser(User user);
    
    int updateUser(User user);
    
    List<User> queryAllUser();
}
