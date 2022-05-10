package com.hxm.design.demo;

import java.util.Objects;

/**
 * 赖汉模式，线程不安全
 * @author hxmao
 * @date 2022/5/10 14:29
 */
public class Singleton_01 {

    private static Singleton_01 instance;

    private Singleton_01(){

    }

    public static Singleton_01 getInstance(){
        if (Objects.nonNull(instance)) {
            return instance;
        }
        instance = new Singleton_01();
        return instance;
    }

}
