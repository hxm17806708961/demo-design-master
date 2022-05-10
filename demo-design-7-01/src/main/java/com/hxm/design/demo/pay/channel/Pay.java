package com.hxm.design.demo.pay.channel;

import com.hxm.design.demo.pay.mode.IPayMode;
import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;

/**
 * @author hxmao
 * @date 2022/5/10 17:59
 */
@Slf4j
public abstract class Pay {

    protected IPayMode iPayMode;

    public Pay(IPayMode iPayMode){
        this.iPayMode = iPayMode;
    }

    public abstract String transfer(String uId, String tradeId, BigDecimal amount);

}
