package com.hxm.design.demo;

import lombok.extern.slf4j.Slf4j;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author hxmao
 * @date 2022/5/7 9:55
 */
@Slf4j
public class RedisUtil {

    private Map<String, String> map = new ConcurrentHashMap<>();

    public String get(String key){
        log.info("redis 读取数据 {}",key);

        return map.get(key);
    }

    public void set(String key, String value){
        log.info("redis 设置数据 {}， {}",key,value);
        map.put(key,value);
    }

    public void del(String key){
        log.info("redis 删除数据 {}", key);
        map.remove(key);
    }

}
