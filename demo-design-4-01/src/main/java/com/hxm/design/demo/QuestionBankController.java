package com.hxm.design.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author hxmao
 * @date 2022/5/10 11:04
 */
public class QuestionBankController {

    public String createPaper(String candidate, String number){

        List<ChoiceQuestion> choiceQuestionList = new ArrayList<>();

        List<AnswerQuestion> answerQuestionList = new ArrayList<>();

        Map<String, String> map01 = new HashMap<String, String>();
        map01.put("A", "JAVA2 EE");
        map01.put("B", "JAVA2 Card");
        map01.put("C", "JAVA2 ME");
        map01.put("D", "JAVA2 HE");
        map01.put("E", "JAVA2 SE");
        Map<String, String> map02 = new HashMap<String, String>();
        map02.put("A", "JAVA程序的main⽅法必须写在类⾥⾯");
        map02.put("B", "JAVA程序中可以有多个main⽅法");
        map02.put("C", "JAVA程序中类名必须与⽂件名⼀样");
        map02.put("D", "JAVA程序的main⽅法中如果只有⼀条语句，可以不⽤{}(⼤括号)括起来");
        Map<String, String> map03 = new HashMap<String, String>();
        map03.put("A", "变量由字⺟、下划线、数字、$符号随意组成；");
        map03.put("B", "变量不能以数字作为开头；");
        map03.put("C", "A和a在java中是同⼀个变量；");
        map03.put("D", "不同类型的变量，可以起相同的名字；");
        Map<String, String> map04 = new HashMap<String, String>();
        map04.put("A", "STRING");
        map04.put("B", "x3x;");
        map04.put("C", "void");
        map04.put("D", "de$f");

        choiceQuestionList.add(new ChoiceQuestion("JAVA所定义的版本中不包括",
                map01, "D"));
        choiceQuestionList.add(new ChoiceQuestion("下列说法正确的是", map02,
                "A"));
        choiceQuestionList.add(new ChoiceQuestion("变量命名规范说法正确的是",
                map03, "B"));
        choiceQuestionList.add(new ChoiceQuestion("以下()不是合法的标识符",
                map04, "C"));

        // 输出结果
        StringBuilder detail = new StringBuilder("考⽣：" + candidate +
                "\r\n" +
                "考号：" + number + "\r\n" +
                "--------------------------------------------\r\n" +
                "⼀、选择题" + "\r\n\n");
        for (int idx = 0; idx < choiceQuestionList.size(); idx++) {
            detail.append("第").append(idx +
                    1).append("题：").append(choiceQuestionList.get(idx).getName()).append("\r\n");
                    Map<String, String> option =
                            choiceQuestionList.get(idx).getOption();
            for (String key : option.keySet()) {

                detail.append(key).append("：").append(option.get(key)).append("\r\n");
                ;
            }
            detail.append("答案：").append(choiceQuestionList.get(idx).getKey()).append("\r\n\n");
        }

        return detail.toString();

    }
}
