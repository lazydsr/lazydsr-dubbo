package com.lazydsr.dubbo.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.lazydsr.dubbo.service.TestService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TestController
 * PROJECT_NAME: lazydsr-dubbo
 * PACKAGE_NAME: com.lazydsr.dubbo.controller
 * Created by Lazy on 2018/6/11 22:17
 * Version: 0.1
 * Info: @TODO:...
 */
@RestController
public class TestController {
    @Reference
    private TestService testService;
    @RequestMapping("test")
    public String test(){
        return testService.testService("zhagnsan");
    }
}
