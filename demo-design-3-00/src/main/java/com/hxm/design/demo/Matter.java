package com.hxm.design.demo;

import java.math.BigDecimal;

/**
 * @author hxmao
 * @date 2022/5/9 18:12
 */
public interface Matter {

    String scene(); // 场景；地板、地砖、涂料、吊顶
    String brand(); // 品牌
    String model(); // 型号
    BigDecimal price(); // 价格
    String desc(); // 描述
}
