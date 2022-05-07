package com.hxm.design.demo;

import com.hxm.design.demo.impl.CacheServiceImpl;
import junit.framework.TestCase;

/**
 * @author hxmao
 * @date 2022/5/7 10:37
 */
public class CacheServiceTest extends TestCase {

    private CacheService cacheService = new CacheServiceImpl();

    /**
     * 添加和删除都要调用统一个集群才能读到数据
     */
    public void testGet() {

        cacheService.set("1", "aaaa", 1);

        System.out.println(cacheService.get("1", 2));

    }

    public void testSet() {
    }

    public void testDel() {
    }
}