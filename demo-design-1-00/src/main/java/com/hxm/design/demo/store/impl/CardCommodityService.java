package com.hxm.design.demo.store.impl;

import com.hxm.design.demo.store.ICommodity;
import lombok.extern.slf4j.Slf4j;

import java.util.Map;

/**
 * @author hxmao
 * @date 2022/5/6 17:43
 */
@Slf4j
public class CardCommodityService implements ICommodity {

//    private Logger logger = LoggerFactory.getLogger(CardCommodityService.class);

    @Override
    public void sendCommodity(String id, String commodityId, String bizId, Map<String, String> extMap) throws Exception {
        // 调用服务

        log.info("请求兑换卡 => uid = {}", id);

    }
}
