package com.lazydsr.dubbo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

import javax.swing.*;

/**
 * ConsumerApplication
 * PROJECT_NAME: lazydsr-dubbo
 * PACKAGE_NAME: com.lazydsr.dubbo
 * Created by Lazy on 2018/6/11 20:55
 * Version: 0.1
 * Info: @TODO:...
 */
@SpringBootApplication
@ImportResource({"classpath:config/spring-dubbo.xml"})
@Slf4j
public class ConsumerApplication {
    public static void main(String[] args) {
      log.error("sssssss");
        SpringApplication.run(ConsumerApplication.class,args);
    }
}
