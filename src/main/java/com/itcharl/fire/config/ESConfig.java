/*
 * Copyright (C) 2006-2016 AiJia All rights reserved
 * Author: Charl
 * Date: 2018/6/5
 * Description:ESConfiguration.java
 */
package com.itcharl.fire.config;

import org.apache.http.HttpHost;
import org.elasticsearch.client.RestClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.AbstractFactoryBean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Charl
 */
@Configuration
public class ESConfig extends AbstractFactoryBean{
    
    @Autowired
    private ESProperties esProperties;

    private RestClient restClient;
    
    @Override
    public Class<?> getObjectType() {
        return RestClient.class;
    }

    @Override
    protected Object createInstance() throws Exception {
        return buildClient();
    }

    @Override
    public void destroy() throws Exception {
        try {
            if (restClient != null) {
                restClient.close();
            }
        } catch (final Exception e) {
            System.out.println("Error closing ElasticSearch client:"+e);
        }
    }

    private RestClient buildClient() {
        try {
            restClient = RestClient.builder(new HttpHost(esProperties.getHostName(), esProperties.getPort(), "http"),
                    new HttpHost(esProperties.getHostName(), 9201, "http")).build();
        } catch (Exception e) {
            System.out.println("");
        }
        return restClient;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
