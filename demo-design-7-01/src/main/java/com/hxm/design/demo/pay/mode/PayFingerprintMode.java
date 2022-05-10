package com.hxm.design.demo.pay.mode;

import lombok.extern.slf4j.Slf4j;

/**
 * @author hxmao
 * @date 2022/5/10 18:07
 */
@Slf4j
public class PayFingerprintMode implements IPayMode{
    @Override
    public boolean security(String uId) {
        log.info("指纹支付，安全校验");
        return true;
    }
}
