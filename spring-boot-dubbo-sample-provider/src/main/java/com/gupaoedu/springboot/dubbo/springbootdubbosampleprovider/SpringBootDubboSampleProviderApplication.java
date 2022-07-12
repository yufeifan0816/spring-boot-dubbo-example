package com.gupaoedu.springboot.dubbo.springbootdubbosampleprovider;

import org.apache.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@DubboComponentScan(basePackages = "com.gupaoedu.springboot.dubbo.springbootdubbosampleprovider.services")
@SpringBootApplication
public class SpringBootDubboSampleProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDubboSampleProviderApplication.class, args);
    }

}
