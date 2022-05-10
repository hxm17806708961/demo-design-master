package com.hxm.design.demo;

import junit.framework.TestCase;

import java.math.BigDecimal;

/**
 * @author hxmao
 * @date 2022/5/10 17:54
 */
public class PayControllerTest extends TestCase {

    public void testDoPay() {
        PayController pay = new PayController();
        System.out.println("\r\n模拟测试场景；微信⽀付、⼈脸⽅式。");
        pay.doPay("weixin_1092033111", "100000109893", new BigDecimal(100), 1,
                2);

        System.out.println("\r\n模拟测试场景；⽀付宝⽀付、指纹⽅式。");
        pay.doPay("jlu19dlxo111","100000109894",new BigDecimal(100), 2, 3);
    }
}