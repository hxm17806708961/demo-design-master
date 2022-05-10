package com.hxm.design.demo;

/**
 * 饿汉模式，线程安全,启动及创建，占用空间
 * @author hxmao
 * @date 2022/5/10 14:40
 */
public class Singleton_03 {
    private static Singleton_03 instance = new Singleton_03();

    private Singleton_03(){

    }

    public static Singleton_03 getInstance(){
        return instance;
    }
}
