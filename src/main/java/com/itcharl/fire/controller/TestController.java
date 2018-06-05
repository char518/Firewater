/*
 * Copyright (C) 2006-2016 AiJia All rights reserved
 * Author: Charl
 * Date: 2018/5/14
 * Description:TestController.java
 */
package com.itcharl.fire.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Charl
 */
@RestController
public class TestController {
    
    @RequestMapping("/index")
    public String index() {
        return "项目成功启动！";
    }
    
}
