package com.hxm.design.demo;

import com.hxm.design.demo.util.Topic;
import com.hxm.design.demo.util.TopicRandomUtil;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * @author hxmao
 * @date 2022/5/10 11:39
 */
@Getter
@Setter
public class QuestionBank implements Cloneable{

    private String candidate;

    private String number;

    private ArrayList<ChoiceQuestion> choiceQuestionList = new
            ArrayList<ChoiceQuestion>();
    private ArrayList<AnswerQuestion> answerQuestionList = new
            ArrayList<AnswerQuestion>();

    public QuestionBank append(ChoiceQuestion choiceQuestion) {
        choiceQuestionList.add(choiceQuestion);
        return this;
    }
    public QuestionBank append(AnswerQuestion answerQuestion) {
        answerQuestionList.add(answerQuestion);
        return this;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {

        QuestionBank questionBank = (QuestionBank) super.clone();

        questionBank.answerQuestionList= (ArrayList<AnswerQuestion>) this.answerQuestionList.clone();
        questionBank.choiceQuestionList = (ArrayList<ChoiceQuestion>) this.choiceQuestionList.clone();

        // 题目乱序
        Collections.shuffle(questionBank.answerQuestionList);
        Collections.shuffle(questionBank.choiceQuestionList);

        // 答案乱序
        List<ChoiceQuestion> choiceQuestionList = questionBank.choiceQuestionList;
        for (ChoiceQuestion choiceQuestion :
                choiceQuestionList) {
            Topic random = TopicRandomUtil.random(choiceQuestion.getOption(), choiceQuestion.getKey());

            choiceQuestion.setOption(random.getOption());
            choiceQuestion.setKey(random.getKey());
        }
        return questionBank;
    }

    @Override
    public String toString() {
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

                detail.append(key).append("：").append(option.get(key)).append("\r\n");;
            }
            detail.append("答 案：").append(choiceQuestionList.get(idx).getKey()).append("\r\n\n");
        }
        detail.append("⼆、问答题" + "\r\n\n");
        for (int idx = 0; idx < answerQuestionList.size(); idx++) {
            detail.append("第").append(idx +
                    1).append("题：").append(answerQuestionList.get(idx).getName()).append("\r\n");
                    detail.append("答案：").append(answerQuestionList.get(idx).getKey()).append("\r\n\n");
        }
        return detail.toString();
    }
}
