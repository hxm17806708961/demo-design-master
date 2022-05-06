package com.hxm.design.demo;

import com.hxm.design.demo.store.ICommodity;
import junit.framework.TestCase;
import org.junit.Test;

/**
 * @author hxmao
 * @date 2022/5/6 18:04
 */
public class StoreFactoryTest extends TestCase {

    @Test
    public void testGetCommodityService() throws Exception {
        ICommodity commodityService1 = StoreFactory.getCommodityService(1);
        commodityService1.sendCommodity("1231", "hhh", "aaa", null);

        ICommodity commodityService2 = StoreFactory.getCommodityService(2);
        commodityService1.sendCommodity("1231", "hhh", "aaa", null);

        ICommodity commodityService3 = StoreFactory.getCommodityService(3);
        commodityService1.sendCommodity("1231", "hhh", "aaa", null);

        ICommodity commodityService4 = StoreFactory.getCommodityService(4);
        commodityService1.sendCommodity("1231", "hhh", "aaa", null);
    }
}