package com.gupaoedu.springboot.dubbo.springbootdubbosampleconsumer;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class GetIpDemo {
    public static void main(String[] args) {
        try {
            for (int i=0;i<9;i++) {
                String hostToBind = InetAddress.getLocalHost().getHostAddress();
                System.out.println("hostToBind=" + hostToBind);
                //hostToBind=192.168.100.1
            }
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
