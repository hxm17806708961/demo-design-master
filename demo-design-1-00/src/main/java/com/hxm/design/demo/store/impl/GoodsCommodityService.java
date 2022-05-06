package com.hxm.design.demo.store.impl;

import com.hxm.design.demo.store.ICommodity;
import lombok.extern.slf4j.Slf4j;

import java.util.Map;

/**
 * @author hxmao
 * @date 2022/5/6 17:45
 */
@Slf4j
public class GoodsCommodityService implements ICommodity {
    @Override
    public void sendCommodity(String id, String commodityId, String bizId, Map<String, String> extMap) throws Exception {

        log.info("发送商品 => id = {}", id);

    }
}
