package com.hxm.design.demo;

import junit.framework.TestCase;

import java.math.BigDecimal;

/**
 * @author hxmao
 * @date 2022/5/10 9:53
 */
public class DecorationPackageControllerTest extends TestCase {

    public void testGetMatterList() {

        DecorationPackageController decorationPackageController = new DecorationPackageController();

        System.out.println(decorationPackageController.getMatterList(new BigDecimal(1.3), 1));
        System.out.println(decorationPackageController.getMatterList(new BigDecimal(1.3), 2));
    }
}