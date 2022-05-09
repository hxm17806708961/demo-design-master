package com.hxm.design.demo.ceilling;

import com.hxm.design.demo.Matter;

import java.math.BigDecimal;

/**
 * @author hxmao
 * @date 2022/5/9 18:10
 */
public class LevelOneCeiling implements Matter {
    @Override
    public String scene() {
        return "吊顶";
    }

    @Override
    public String brand() {
        return "装修公司自带";
    }

    @Override
    public String model() {
        return "一级吊顶";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal(260);
    }

    @Override
    public String desc() {
        return "造型只做低⼀级，只有⼀个层次的吊顶，⼀般离顶120-150mm";
    }
}
