package com.gupaoedu.springboot.dubbo.springbootdubbosampleprovider.services;


import com.gupaoedu.springboot.dubbo.ISayHelloService;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * 咕泡学院，只为更好的你
 * 咕泡学院-Mic: 2227324689
 * http://www.gupaoedu.com
 **/

@DubboService(registry = {"hunan"},version = "1.0",protocol = {"dubbo"})
public class PayServiceImpl implements ISayHelloService {

    public PayServiceImpl()
    {
        System.out.println("construct SayHelloServiceImpl...");
    }

    @Override
    public String sayHello(String msg) {
        System.out.println("SayHelloServiceImpl.sayHello()请求成功");
        return "[version1.0]Hello,"+msg+" GuPaoEdu.cn";
    }

    @Override
    public String sayByby(String msg) {
        System.out.println("SayHelloServiceImpl.sayByby()请求成功");
        return "[version1.0]Hello,"+msg+" GuPaoEdu.cn";
    }
}
