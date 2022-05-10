package com.hxm.design.demo.service;

import lombok.extern.slf4j.Slf4j;

/**
 * @author hxmao
 * @date 2022/5/10 16:26
 */
@Slf4j
public class OrderService {

    public Long queryUserOrderCount(String userId){
        log.info("⾃营商家，查询⽤户的订单是否为⾸单：{}", userId);
        return 12L;
    }
}
