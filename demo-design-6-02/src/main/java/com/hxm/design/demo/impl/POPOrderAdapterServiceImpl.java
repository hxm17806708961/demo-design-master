package com.hxm.design.demo.impl;

import com.hxm.design.demo.OrderAdapterService;
import com.hxm.design.demo.service.POPOrderService;

/**
 * @author hxmao
 * @date 2022/5/10 17:18
 */
public class POPOrderAdapterServiceImpl implements OrderAdapterService {

    private POPOrderService popOrderService = new POPOrderService();

    @Override
    public boolean isFirst(String uId) {
        return popOrderService.isFirstOrder("23");
    }
}
