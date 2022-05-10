package com.hxm.design.demo.pay.channel;

import com.hxm.design.demo.pay.mode.IPayMode;
import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;

/**
 * @author hxmao
 * @date 2022/5/10 17:59
 */
@Slf4j
public class ZFBPay extends Pay{

    public ZFBPay(IPayMode iPayMode) {
        super(iPayMode);
    }

    @Override
    public String transfer(String uId, String tradeId, BigDecimal amount) {
        log.info("模拟⽀付宝渠道⽀付划账开始。uId：{} tradeId：{} amount：  {}", uId, tradeId, amount);
        boolean security = iPayMode.security(uId);
        log.info("模拟⽀付宝渠道⽀付⻛控校验。uId：{} tradeId：{} security： {}", uId, tradeId, security);
        if (!security) {
            log.info("模拟⽀付宝渠道⽀付划账拦截。uId：{} tradeId：{} amount：{}", uId, tradeId, amount);
            return "0001";
        }
        log.info("模拟⽀付宝渠道⽀付划账成功。uId：{} tradeId：{} amount：  {}", uId, tradeId, amount);
        return "0000";
    }
}
