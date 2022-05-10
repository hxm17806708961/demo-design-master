package com.hxm.design.demo.pay.mode;

import lombok.extern.slf4j.Slf4j;

/**
 * @author hxmao
 * @date 2022/5/10 18:07
 */
@Slf4j
public class PayFaceMode implements IPayMode{

    @Override
    public boolean security(String uId) {
        log.info("⼈脸⽀付，⻛控校验脸部识别");
        return true;
    }
}
