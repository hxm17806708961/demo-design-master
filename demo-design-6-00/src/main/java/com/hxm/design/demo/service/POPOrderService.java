package com.hxm.design.demo.service;

import lombok.extern.slf4j.Slf4j;

/**
 * @author hxmao
 * @date 2022/5/10 16:27
 */
@Slf4j
public class POPOrderService {

    public boolean isFirstOrder(String uId) {
        log.info("POP商家，查询⽤户的订单是否为⾸单：{}", uId);
        return true;
    }

}
