package com.gupaoedu.springboot.dubbo;

import javax.ws.rs.HeaderParam;
import javax.ws.rs.Path;
import javax.ws.rs.GET;

/**
 * 咕泡学院，只为更好的你
 * 咕泡学院-Mic: 2227324689
 * http://www.gupaoedu.com
 **/
@Path("/")
public interface ISayHelloService {

    @GET
    @Path("/say")
    String sayHello(String msg);

    String sayByby(String msg);
}
