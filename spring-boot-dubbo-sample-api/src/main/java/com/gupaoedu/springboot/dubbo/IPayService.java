package com.gupaoedu.springboot.dubbo;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * 咕泡学院，只为更好的你
 * 咕泡学院-Mic: 2227324689
 * http://www.gupaoedu.com
 **/
@Path("/")
public interface IPayService {

    @GET
    @Path("/pay")
    String pay(String msg);
}
