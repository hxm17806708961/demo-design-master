package com.hxm.design.demo.store;

import java.util.Map;

/**
 * @author hxmao
 * @date 2022/5/6 17:40
 */
public interface ICommodity {

    void sendCommodity(String id, String commodityId, String bizId, Map<String, String> extMap) throws Exception;
}
