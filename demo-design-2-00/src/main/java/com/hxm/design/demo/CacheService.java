package com.hxm.design.demo;

import java.util.concurrent.TimeUnit;

/**
 * @author hxmao
 * @date 2022/5/7 10:43
 */
public interface CacheService {
    String get(final String key);
    void set(String key, String value);
    void del(String key);
}
