package com.hxm.design.demo;

import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;

/**
 * @author hxmao
 * @date 2022/5/10 17:51
 */
@Slf4j
public class PayController {

    public boolean doPay(String uId, String tradeId, BigDecimal amount,
                         int channelType, int modeType){

        if (1 == channelType) {
            log.info("模拟微信渠道⽀付划账开始。uId：{} tradeId：{} amount：{}", uId, tradeId, amount);
            if (1 == modeType) {
                log.info("密码⽀付，⻛控校验环境安全");
            } else if (2 == modeType) {
                log.info("⼈脸⽀付，⻛控校验脸部识别");
            } else if (3 == modeType) {
                log.info("指纹⽀付，⻛控校验指纹信息");
            }
        }
        // ⽀付宝⽀付
        else if (2 == channelType) {
            log.info("模拟⽀付宝渠道⽀付划账开始。uId：{} tradeId：{}amount：{}", uId, tradeId, amount);
            if (1 == modeType) {
                log.info("密码⽀付，⻛控校验环境安全");
            } else if (2 == modeType) {
                log.info("⼈脸⽀付，⻛控校验脸部识别");
            } else if (3 == modeType) {
                log.info("指纹⽀付，⻛控校验指纹信息");
            }
        }
        return true;
    }

}
