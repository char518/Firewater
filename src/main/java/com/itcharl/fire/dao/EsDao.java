/*
 * Copyright (C) 2006-2016 AiJia All rights reserved
 * Author: Charl
 * Date: 2018/6/5
 * Description:EsDao.java
 */
package com.itcharl.fire.dao;

import com.itcharl.fire.config.ESConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * @author Charl
 */
@Repository
public class EsDao {
    
    @Autowired
    private ESConfig esConfig;
    
    
    
}
