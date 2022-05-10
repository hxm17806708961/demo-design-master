package com.hxm.design.demo;

import lombok.Getter;
import lombok.Setter;

/**
 * @author hxmao
 * @date 2022/5/10 10:58
 */
@Setter
@Getter
public class AnswerQuestion {

    private String name;

    private String key;

    public AnswerQuestion(String name, String key) {
        this.name = name;
        this.key = key;
    }
}
