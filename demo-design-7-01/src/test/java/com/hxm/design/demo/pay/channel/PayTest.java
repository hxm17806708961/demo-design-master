package com.hxm.design.demo.pay.channel;

import com.hxm.design.demo.pay.mode.PayCypher;
import com.hxm.design.demo.pay.mode.PayFaceMode;
import junit.framework.TestCase;

import java.math.BigDecimal;

/**
 * @author hxmao
 * @date 2022/5/10 18:12
 */
public class PayTest extends TestCase {

    public void testPay(){
        Pay wxPay = new WeChatPay(new PayFaceMode());

        wxPay.transfer("weixin_1092033111", "100000109893", new
                BigDecimal(100));

        Pay zfbPay = new ZFBPay(new PayCypher());
        zfbPay.transfer("jlu19dlxo111","100000109894",new BigDecimal(100));
    }
}