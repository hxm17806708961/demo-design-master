package com.hxm.design.demo.impl;

import com.hxm.design.demo.OrderAdapterService;
import com.hxm.design.demo.service.OrderService;

/**
 * @author hxmao
 * @date 2022/5/10 17:16
 */
public class InsideOrderServiceImpl implements OrderAdapterService {
    private OrderService orderService = new OrderService();

    @Override
    public boolean isFirst(String uId) {
        return orderService.queryUserOrderCount("12") < 12;
    }

}
