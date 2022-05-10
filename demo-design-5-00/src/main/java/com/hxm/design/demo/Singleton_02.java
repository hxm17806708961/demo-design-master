package com.hxm.design.demo;

import java.util.Objects;

/**
 * 赖汉模式，线程安全
 * @author hxmao
 * @date 2022/5/10 14:34
 */
public class Singleton_02 {

    private static Singleton_02 instance;

    private Singleton_02() {
    }

    public static synchronized Singleton_02 getInstance(){
        if (Objects.nonNull(instance)){
            return instance;
        }

        instance = new Singleton_02();

        return instance;
    }
}
