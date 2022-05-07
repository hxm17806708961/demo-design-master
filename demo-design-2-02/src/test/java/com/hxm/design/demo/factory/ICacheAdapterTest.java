package com.hxm.design.demo.factory;

import com.hxm.design.demo.CacheService;
import com.hxm.design.demo.factory.impl.EGMCacheAdapter;
import com.hxm.design.demo.factory.impl.IIRCacheAdapter;
import com.hxm.design.demo.impl.CacheServiceImpl;
import junit.framework.TestCase;

/**
 * @author hxmao
 * @date 2022/5/7 11:16
 */
public class ICacheAdapterTest extends TestCase {

    public void testGet() throws Exception {
        CacheService cacheService = JDKProxy.getProxy(CacheServiceImpl.class, new IIRCacheAdapter());
        cacheService.set("a", "hhhh");
        System.out.println(cacheService.get("a"));

        CacheService cacheService2 = JDKProxy.getProxy(CacheServiceImpl.class, new EGMCacheAdapter());
        cacheService2.set("b", "6666");
        System.out.println(cacheService2.get("b"));

    }

    public void testSet() throws Exception {




    }

    public void testDel() {

    }
}