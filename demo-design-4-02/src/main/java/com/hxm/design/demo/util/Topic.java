package com.hxm.design.demo.util;

import lombok.Getter;
import lombok.Setter;

import java.util.Map;

/**
 * @author hxmao
 * @date 2022/5/10 11:20
 */
@Setter
@Getter
public class Topic {
    private String name;

    private Map<String, String> option;

    private String key;

    public Topic(Map<String, String> option, String key) {
        this.option = option;
        this.key = key;
    }
}
