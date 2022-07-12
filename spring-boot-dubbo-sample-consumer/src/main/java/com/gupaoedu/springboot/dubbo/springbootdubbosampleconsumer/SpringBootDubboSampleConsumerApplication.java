package com.gupaoedu.springboot.dubbo.springbootdubbosampleconsumer;

import com.gupaoedu.springboot.dubbo.ISayHelloService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringBootDubboSampleConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDubboSampleConsumerApplication.class, args);
    }

    //调用根据注册中心 根据环境选择不同loadbalance，loadBalance，放到url里面，自适应spi去拿？
    //拿负载均衡 ，修改dubbo
    @DubboReference(registry = "hunan",version = "1.0",loadbalance = "gploadbalance")
    ISayHelloService sayHelloService;

    @GetMapping("/say")
    public String say(){
        System.out.println("SpringBootDubboSampleConsumerApplication.say()");
        return sayHelloService.sayHello("Mic");
    }

}
