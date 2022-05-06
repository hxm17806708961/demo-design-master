package com.hxm.design.demo;

import com.hxm.design.demo.store.ICommodity;
import com.hxm.design.demo.store.impl.CardCommodityService;
import com.hxm.design.demo.store.impl.CouponCommodityService;
import com.hxm.design.demo.store.impl.GoodsCommodityService;

import java.util.Objects;

/**
 * 工厂模式
 * @author hxmao
 * @date 2022/5/6 17:39
 */
public class StoreFactory {

    public static ICommodity getCommodityService(Integer commodityType){
        if (Objects.isNull(commodityType)) return null;
        if (1 == commodityType) return new CouponCommodityService();
        if (2 == commodityType) return new CardCommodityService();
        if (3 == commodityType) return new GoodsCommodityService();
        throw new RuntimeException("不存在的商品服务！");
    }
}
