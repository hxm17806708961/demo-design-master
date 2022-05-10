package com.hxm.design.demo;

import lombok.Getter;
import lombok.Setter;

import java.util.Map;

/**
 * @author hxmao
 * @date 2022/5/10 10:58
 */
@Setter
@Getter
public class ChoiceQuestion {
    private String name;

    private Map<String, String> option;

    private String key;

    public ChoiceQuestion(){

    }

    public ChoiceQuestion(String name, Map<String, String> option, String key) {
        this.name = name;
        this.option = option;
        this.key = key;
    }


}
