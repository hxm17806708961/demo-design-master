package demo.store.impl;

import com.hxm.design.store.coupon.CouponService;
import demo.store.ICommodity;
import lombok.extern.slf4j.Slf4j;

import java.util.Map;

/**
 * @author hxmao
 * @date 2022/5/6 17:44
 */
@Slf4j
public class CouponCommodityService implements ICommodity {

    private CouponService couponCommodityService = new CouponService();

    @Override
    public void sendCommodity(String id, String commodityId, String bizId, Map<String, String> extMap) throws Exception {

        log.info("发送消费券 => uid = {}", id);
        couponCommodityService.sendCoupon(id, commodityId, bizId);
    }
}
