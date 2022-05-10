package com.hxm.design.demo;

import com.alibaba.fastjson.JSON;
import com.hxm.design.demo.mq.CreateAccount;

/**
 * @author hxmao
 * @date 2022/5/10 16:30
 */
public class CreateAccountMQService {

    public void onMessage(String message) {
        CreateAccount mq = JSON.parseObject(message,
                CreateAccount.class);
        mq.getNumber();
        mq.getAccountDate();
        // ... 处理⾃⼰的业务
    }
}
