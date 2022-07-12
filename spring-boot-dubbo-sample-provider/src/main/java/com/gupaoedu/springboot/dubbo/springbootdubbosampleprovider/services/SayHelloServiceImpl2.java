package com.gupaoedu.springboot.dubbo.springbootdubbosampleprovider.services;


import com.gupaoedu.springboot.dubbo.ISayHelloService;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * 咕泡学院，只为更好的你
 * 咕泡学院-Mic: 2227324689
 * http://www.gupaoedu.com
 **/

//@DubboService(registry = {"shanghai","hunan"},version = "2.0")
public class SayHelloServiceImpl2 implements ISayHelloService {
    public SayHelloServiceImpl2()
    {
        System.out.println("construct SayHelloServiceImpl2...");
    }

    @Override
    public String sayHello(String msg) {
        System.out.println("SayHelloServiceImpl2.sayHello()请求成功");
        return "[Version2.0]Hello,"+msg+" GuPaoEdu.cn";
    }

    @Override
    public String sayByby(String msg) {
        return null;
    }
}
