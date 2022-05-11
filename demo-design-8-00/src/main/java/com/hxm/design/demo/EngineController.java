package com.hxm.design.demo;

import lombok.extern.slf4j.Slf4j;

/**
 * @author hxmao
 * @date 2022/5/11 17:26
 */
@Slf4j
public class EngineController {
    public String process(final String userId, final String userSex, final
    int userAge) {
        log.info("ifelse实现⽅式判断⽤户结果。userId：{} userSex：{}userAge：{}", userId, userSex, userAge);
        if ("man".equals(userSex)) {
            if (userAge < 25) {
                return "果实A";
            }
            if (userAge >= 25) {
                return "果实B";
            }
        }
        if ("woman".equals(userSex)) {
            if (userAge < 25) {
                return "果实C";
            }
            if (userAge >= 25) {
                return "果实D";
            }
        }
        return null;
    }
}
