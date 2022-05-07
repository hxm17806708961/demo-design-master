package com.hxm.design.demo;

/**
 * @author hxmao
 * @date 2022/5/7 10:12
 */
public interface CacheService {

    String get(String key, Integer redisType);

    void set(String key, String value, Integer redisType);

    void del(String key, Integer redisType);
}
