package com.hxm.design.demo.factory.impl;

import com.hxm.design.demo.factory.ICacheAdapter;
import com.hxm.design.demo.matter.IIR;

/**
 * @author hxmao
 * @date 2022/5/7 10:54
 */
public class IIRCacheAdapter implements ICacheAdapter {

    private IIR iir = new IIR();
    @Override
    public String get(String key) {
        return iir.gain(key);
    }

    @Override
    public void set(String key, String value) {
        iir.set(key, value);

    }

    @Override
    public void del(String key) {

        iir.delete(key);
    }
}
