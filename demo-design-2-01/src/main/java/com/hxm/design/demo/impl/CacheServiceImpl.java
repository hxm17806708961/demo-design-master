package com.hxm.design.demo.impl;

import com.hxm.design.demo.CacheService;
import com.hxm.design.demo.RedisUtil;
import com.hxm.design.demo.matter.EGM;
import com.hxm.design.demo.matter.IIR;
import lombok.extern.slf4j.Slf4j;

/**
 *
 * @author hxmao
 * @date 2022/5/7 10:13
 */
@Slf4j
public class CacheServiceImpl implements CacheService {


    private RedisUtil redisUtil = new RedisUtil();

    private EGM egm = new EGM();

    private IIR iir = new IIR();

    @Override
    public String get(String key, Integer redisType) {
        if (1 == redisType){
            return egm.gain(key);
        }

        if (2 == redisType){
            return iir.gain(key);
        }

        return redisUtil.get(key);
    }

    @Override
    public void set(String key, String value, Integer redisType) {

        if (1 == redisType){
            egm.set(key, value);
            return;
        }

        if (2 == redisType){
            iir.set(key, value);
            return;
        }

        redisUtil.set(key, value);
    }

    @Override
    public void del(String key, Integer redisType) {

        if (1 == redisType){
            egm.delete(key);
            return;
        }

        if (2 == redisType){
            iir.delete(key);
            return;
        }

        redisUtil.del(key);

    }
}
