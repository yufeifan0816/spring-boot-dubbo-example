package com.gupaoedu.springboot.dubbo.springbootdubbosampleconsumer;

import com.gupaoedu.springboot.dubbo.ISayHelloService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.apache.dubbo.config.annotation.Method;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 咕泡学院，只为更好的你
 * 咕泡学院-Mic: 2227324689
 * http://www.gupaoedu.com
 **/
@RestController
public class SayController {

    /**
     * 请求失败就会走到mock<br>
     *     check:启动检查（循环依赖的时候就起不来了，不然false）
     */
    @DubboReference(registry = "hunan",
            version = "1.0",
            cluster = "failfast",check = false,methods = {
            @Method(loadbalance = "random",name ="sayHello" ) //这里增对方法级别，方法级别优先于接口层面
    },retries = 5)
    ISayHelloService sayHelloService;

    @GetMapping("/say2")
    public String say(){
        return sayHelloService.sayHello("yufeifan");
    }

//    @GetMapping("/say3")
//    public String say3(){
//        return sayHelloService.sayHello3("Mic");
//        //httpClient.post(http://localhost:8080/sayHello3)
//    }
}
