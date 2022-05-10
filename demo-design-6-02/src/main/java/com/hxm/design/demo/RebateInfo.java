package com.hxm.design.demo;

import lombok.Data;

import java.util.Date;

/**
 * 消息实体
 * @author hxmao
 * @date 2022/5/10 16:48
 */
@Data
public class RebateInfo {
    private String userId; // ⽤户ID
    private String bizId; // 业务ID
    private Date bizTime; // 业务时间
    private String desc; // 业务描述


}
