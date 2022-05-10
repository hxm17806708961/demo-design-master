package com.hxm.design.demo.mq;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * @author hxmao
 * @date 2022/5/10 16:24
 */
@Getter
@Setter
public class CreateAccount {
    private String number; // 开户编号
    private String address; // 开户地
    private Date accountDate; // 开户时间
    private String desc; // 开户描述
}
