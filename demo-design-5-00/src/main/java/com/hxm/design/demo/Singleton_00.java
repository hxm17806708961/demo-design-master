package com.hxm.design.demo;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 常用单例类
 * @author hxmao
 * @date 2022/5/10 14:27
 */
public class Singleton_00 {
    public static Map<String,String> cache = new ConcurrentHashMap<String,
                String>();
}
