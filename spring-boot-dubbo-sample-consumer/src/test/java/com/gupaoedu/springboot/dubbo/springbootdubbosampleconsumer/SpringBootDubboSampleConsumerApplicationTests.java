package com.gupaoedu.springboot.dubbo.springbootdubbosampleconsumer;

import org.apache.dubbo.common.extension.ExtensionLoader;
import org.apache.dubbo.rpc.cluster.LoadBalance;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootDubboSampleConsumerApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    public void testSpi()
    {
        LoadBalance loadBalance = ExtensionLoader.getExtensionLoader(LoadBalance.class).getExtension("gploadbalance");
    }

}
