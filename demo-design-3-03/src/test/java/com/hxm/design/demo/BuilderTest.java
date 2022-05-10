package com.hxm.design.demo;

import junit.framework.TestCase;

/**
 * @author hxmao
 * @date 2022/5/10 10:30
 */
public class BuilderTest extends TestCase {

    public void testLevelOne() {
        Builder builder = new Builder();

        System.out.println(builder.levelOne(1.2).getDetail());
        System.out.println(builder.levelThree(6.5).getDetail());
    }

    public void testLevelTwo() {
    }

    public void testLevelThree() {
    }
}