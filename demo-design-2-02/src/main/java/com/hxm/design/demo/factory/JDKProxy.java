package com.hxm.design.demo.factory;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * 定义抽象⼯程代理类和实现
 * @author hxmao
 * @date 2022/5/7 10:57
 */
public class JDKProxy {
    public static <T> T getProxy(Class<T> interfaceClass, ICacheAdapter
            cacheAdapter) throws Exception {
        InvocationHandler handler = new JDKInvocationHandler(cacheAdapter);
        ClassLoader classLoader =
                Thread.currentThread().getContextClassLoader();
        Class<?>[] classes = interfaceClass.getInterfaces();
        return (T) Proxy.newProxyInstance(classLoader, new Class[]{classes[0]},
                handler);
    }
}
