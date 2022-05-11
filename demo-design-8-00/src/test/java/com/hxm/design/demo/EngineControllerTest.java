package com.hxm.design.demo;

import junit.framework.TestCase;

/**
 * @author hxmao
 * @date 2022/5/11 17:27
 */
public class EngineControllerTest extends TestCase {

    public void testProcess() {
        EngineController engineController = new EngineController();
        System.out.println(engineController.process("10000", "男", 25));
    }
}