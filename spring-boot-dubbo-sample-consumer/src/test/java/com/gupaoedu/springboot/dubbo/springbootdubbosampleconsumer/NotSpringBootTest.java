package com.gupaoedu.springboot.dubbo.springbootdubbosampleconsumer;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.ExtensionLoader;
import org.apache.dubbo.common.utils.NetUtils;
import org.apache.dubbo.rpc.Invoker;
import org.apache.dubbo.rpc.Protocol;
import org.apache.dubbo.rpc.cluster.LoadBalance;
import org.apache.dubbo.rpc.protocol.dubbo.DubboInvoker;
import org.junit.jupiter.api.Test;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class NotSpringBootTest {

    @Test
    public void testSpi()
    {
        /**
         * ExtensionLoader.getExtensionLoader拿到的是：
         * org.apache.dubbo.common.extension.ExtensionLoader[org.apache.dubbo.rpc.cluster.LoadBalance]<br>
         */
        LoadBalance loadBalance = ExtensionLoader.getExtensionLoader(LoadBalance.class).getExtension("gploadbalance");
        System.out.println("loadBalance:" + loadBalance.toString());
    }

    @Test public void myProtocolTest(){
        Protocol protocol = ExtensionLoader.getExtensionLoader(Protocol.class).getAdaptiveExtension();
        URL url = new URL("jy", "1.2.3.4", 1010, "path1");
        Invoker<Object> invoker = new DubboInvoker<Object>(Object.class,url,null);
        protocol.export(invoker); }

    @Test
    public void testHost()
    {
        try {
            for (int i =0 ;i <5;i++) {
                String host = InetAddress.getLocalHost().getHostAddress();
                System.out.println("i：" + i + "，host=" + host);
            }
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        /**
         * i4host=192.168.8.32输出结果
         *
         * 有一定随机性，原因；
         * InetAddress.getLocalHost()方法里是通过
         * return localAddrs = InetAddress.getAddressesFromNameService(local, null)[0] 返回的<br>
         */
    }

    @Test
    public void testHostWithNetUtils()
    {
        for (int i =0 ;i <5;i++) {
            String host = NetUtils.getLocalHost();
            System.out.println("i：" + i + "，host=" + host);
        }
        /**
         * host=192.168.152.1 这个是输出结果<br>
         *
         * 有一定随机性，原因；
         * InetAddress.getLocalHost()方法里是通过
         * return localAddrs = InetAddress.getAddressesFromNameService(local, null)[0] 返回的<br>
         */
    }
}
