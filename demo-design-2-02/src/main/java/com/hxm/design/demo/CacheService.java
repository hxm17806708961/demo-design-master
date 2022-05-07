package com.hxm.design.demo;

/**
 * @author hxmao
 * @date 2022/5/7 11:35
 */
public interface CacheService {
    String get(String key) ;

    void set(String key, String value) ;


    void del(String key);
}
