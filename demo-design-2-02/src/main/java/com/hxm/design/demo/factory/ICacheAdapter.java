package com.hxm.design.demo.factory;

/**
 * 定义适配接口，封装两个集群的差异
 * @author hxmao
 * @date 2022/5/7 10:50
 */
public interface ICacheAdapter {

    String get(String key);

    void set(String key, String value);

    void del(String key);
}
