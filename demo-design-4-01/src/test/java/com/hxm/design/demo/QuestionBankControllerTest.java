package com.hxm.design.demo;

import junit.framework.TestCase;

/**
 * @author hxmao
 * @date 2022/5/10 11:10
 */
public class QuestionBankControllerTest extends TestCase {

    public void testCreatePaper() {
        QuestionBankController questionBankController = new QuestionBankController();

        System.out.println(questionBankController.createPaper("hxm", "123"));
    }
}