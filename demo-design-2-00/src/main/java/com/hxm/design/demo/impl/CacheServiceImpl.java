package com.hxm.design.demo.impl;

import com.hxm.design.demo.CacheService;
import com.hxm.design.demo.RedisUtil;

/**
 * @author hxmao
 * @date 2022/5/7 10:44
 */
public class CacheServiceImpl implements CacheService {
    private RedisUtil redisUtils = new RedisUtil();

    @Override
    public String get(String key) {
        return redisUtils.get(key);
    }

    @Override
    public void set(String key, String value) {
        redisUtils.set(key, value);
    }


    @Override
    public void del(String key) {
        redisUtils.del(key);
    }
}
