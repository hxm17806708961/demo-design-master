package com.hxm.design.demo;

import java.util.Objects;

/**
 * 双重锁，线程安全,
 * @author hxmao
 * @date 2022/5/10 14:47
 */
public class Singleton_05 {
    private static Singleton_05 instance;

    private Singleton_05(){

    }

    public static Singleton_05 getInstance(){
        if (Objects.nonNull(instance)){
            return instance;
        }

        synchronized (Singleton_05.class){
            if (Objects.isNull(instance)){
                instance = new Singleton_05();
            }
        }

        return instance;
    }
}
