package com.hxm.design.demo;

import junit.framework.TestCase;

/**
 * @author hxmao
 * @date 2022/5/12 18:07
 */
public class LoginSsoDecoratorTest extends TestCase {

    public void testPreHandle() {

        LoginSsoDecorator ssoDecorator = new LoginSsoDecorator();
        String request = "successhuahua";
        boolean success = ssoDecorator.preHandle(request, "ewcdqwt40liuiu",
                "t");
        System.out.println("登录校验：" + request + (success ? " 放⾏" : " 拦截"));

    }
}