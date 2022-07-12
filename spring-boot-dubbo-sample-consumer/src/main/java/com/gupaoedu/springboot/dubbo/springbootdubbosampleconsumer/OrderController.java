package com.gupaoedu.springboot.dubbo.springbootdubbosampleconsumer;

import com.gupaoedu.springboot.dubbo.IPayService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.HashMap;
import java.util.Map;

public class OrderController {

//    @DubboReference(registry = {"shanghai"},version = "1.0")
    IPayService payService;

    @GetMapping("/pay")
    public String pay(String orderId){
        return payService.pay("payService.pay --> orderId:" + orderId);
    }
}
