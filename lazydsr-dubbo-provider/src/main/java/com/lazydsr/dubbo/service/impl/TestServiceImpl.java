package com.lazydsr.dubbo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.lazydsr.dubbo.service.TestService;
import lombok.extern.slf4j.Slf4j;

/**
 * TestServiceImpl
 * PROJECT_NAME: lazydsr-dubbo
 * PACKAGE_NAME: com.lazydsr.dubbo.service.impl
 * Created by Lazy on 2018/6/11 20:33
 * Version: 0.1
 * Info: @TODO:...
 */
@Slf4j
@Service
public class TestServiceImpl implements TestService {
    @Override
    public String testService(String name) {
        log.error("provider:"+name);
        return name;
    }
}
