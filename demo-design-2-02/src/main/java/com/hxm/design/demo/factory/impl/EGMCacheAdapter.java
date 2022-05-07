package com.hxm.design.demo.factory.impl;

import com.hxm.design.demo.factory.ICacheAdapter;
import com.hxm.design.demo.matter.EGM;

/**
 * @author hxmao
 * @date 2022/5/7 10:51
 */
public class EGMCacheAdapter implements ICacheAdapter {

    private EGM egm = new EGM();

    @Override
    public String get(String key) {
        return egm.gain(key);
    }

    @Override
    public void set(String key, String value) {
        egm.set(key, value);
    }

    @Override
    public void del(String key) {
        egm.delete(key);

    }
}
