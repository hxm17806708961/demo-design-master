package com.hxm.design.demo.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 打乱题目内的选项
 * @author hxmao
 * @date 2022/5/10 11:33
 */
public class TopicRandomUtil {
    public static Topic random(Map<String, String> option, String key){
        Set<String> keySet = option.keySet();

        List<String> keySetList = new ArrayList<>(keySet);

        Collections.shuffle(keySetList);

        HashMap<String, String> newOption = new HashMap<>(keySetList.size());

        int idx = 0;
        // 记录打乱后，新的答案
        String newKey = "";

        for (String next :
                keySet) {
            // 获取新增的答案选项
            String randomKey = keySetList.get(idx++);
            if (key.equals(next)){
                newKey = randomKey;
            }

            newOption.put(randomKey, option.get(next));
        }


        return new Topic(newOption, newKey);
    }

}
