/*
 * Copyright (C) 2006-2016 AiJia All rights reserved
 * Author: Charl
 * Date: 2018/6/5
 * Description:ESConfig.java
 */
package com.itcharl.fire.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author Charl
 */
@Component
@ConfigurationProperties(prefix = "spring.es.config")
public class ESProperties {
    
    private String clusterName;
    
    private String clusterNode;
    
    private Integer port;
    
    private String hostName;

    public String getClusterName() {
        return clusterName;
    }

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    public String getClusterNode() {
        return clusterNode;
    }

    public void setClusterNode(String clusterNode) {
        this.clusterNode = clusterNode;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }
}
