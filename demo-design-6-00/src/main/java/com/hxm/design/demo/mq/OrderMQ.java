package com.hxm.design.demo.mq;

import lombok.Data;

import java.util.Date;

/**
 * @author hxmao
 * @date 2022/5/10 16:24
 */
@Data
public class OrderMQ {
    private String uid; // ⽤户ID
    private String sku; // 商品
    private String orderId; // 订单ID
    private Date createOrderTime; // 下单时间

}
