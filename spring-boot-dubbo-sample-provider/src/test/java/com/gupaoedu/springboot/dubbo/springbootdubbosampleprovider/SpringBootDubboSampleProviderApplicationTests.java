package com.gupaoedu.springboot.dubbo.springbootdubbosampleprovider;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.ExtensionLoader;
import org.apache.dubbo.rpc.Filter;
import org.apache.dubbo.rpc.cluster.LoadBalance;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringBootDubboSampleProviderApplicationTests {

    @Test
    void contextLoads() {
    }

    /**
     * 启动可以进入ExtensionLoader进行debug自适应扩展点<br>
     */
    @Test
    public void testSpi()
    {
        LoadBalance loadBalance = ExtensionLoader.getExtensionLoader(LoadBalance.class).getExtension("gploadbalance");
    }

    /**
     * 测试激活扩展点
     * 参考：
     * @Activate(group = {CONSUMER, PROVIDER}, value = CACHE_KEY)
     * public class CacheFilter implements Filter {}
     */
    @Test
    public void testActiveSpi1()
    {
        ExtensionLoader extensionLoader = ExtensionLoader.getExtensionLoader(Filter.class);
        URL url = new URL("","",0);
        List<Filter> filters = extensionLoader.getActivateExtension(url,"cache");
        System.out.println(filters.size());
    }

    /**
     * 测试激活扩展点
     */
    @Test
    public void testActiveSpi2()
    {
        ExtensionLoader extensionLoader = ExtensionLoader.getExtensionLoader(Filter.class);
        URL url = new URL("","",0);
        //如果url存在cache对应的key就会激活CacheFitler
        url = url.addParameter("cache","cache");
        List<Filter> filters = extensionLoader.getActivateExtension(url,"cache");
        System.out.println(filters.size());
    }
}
