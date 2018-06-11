package com.lazydsr.dubbo;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubboConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * ProviderApplication
 * PROJECT_NAME: lazydsr-dubbo
 * PACKAGE_NAME: com.lazydsr.dubbo.service.impl
 * Created by Lazy on 2018/6/11 20:52
 * Version: 0.1
 * Info: @TODO:...
 */
@SpringBootApplication
@ImportResource({"classpath:config/dubbo-provider.xml"})
@EnableDubboConfig
public class ProviderApplication {
    public static void main(String[] args) throws IOException {
        //ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
        //        new String[] {"config/dubbo-provider.xml"});
        //context.start();
        //// press any key to exit
        //
        SpringApplication.run(ProviderApplication.class,args);
        //System.in.read();
    }
}
