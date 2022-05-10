package com.hxm.design.demo;

import com.hxm.design.demo.impl.InsideOrderServiceImpl;
import com.hxm.design.demo.impl.POPOrderAdapterServiceImpl;
import junit.framework.TestCase;

/**
 * @author hxmao
 * @date 2022/5/10 17:26
 */
public class OrderAdapterServiceTest extends TestCase {

    public void testIsFirst() {
        OrderAdapterService insideOrderService = new InsideOrderServiceImpl();

        System.out.println(insideOrderService.isFirst("111111"));

        OrderAdapterService popOrderAdapterService = new POPOrderAdapterServiceImpl();
        System.out.println(popOrderAdapterService.isFirst("222222"));
    }
}