package com.hxm.design.demo;

import junit.framework.TestCase;

/**
 * @author hxmao
 * @date 2022/5/10 14:07
 */
public class QuestionBankControllerTest extends TestCase {

    public void testCreatePaper() throws CloneNotSupportedException {
        QuestionBankController questionBankController = new QuestionBankController();
        System.out.println(questionBankController.createPaper("hxm", "asd"));
        System.out.println(questionBankController.createPaper("666", "asd"));
    }
}