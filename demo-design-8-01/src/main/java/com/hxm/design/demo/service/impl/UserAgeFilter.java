package com.hxm.design.demo.service.impl;

import java.util.Map;

/**
 * @author hxmao
 * @date 2022/5/11 18:02
 */
public class UserAgeFilter extends BaseLogic{

    @Override
    public String matterValue(Long treeId, String userId, Map<String, String> decisionMatter) {
        return decisionMatter.get("age");
    }

}
