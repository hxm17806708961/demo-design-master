package com.hxm.design.demo.service.engine;

import com.hxm.design.demo.service.LogicFilter;
import com.hxm.design.demo.service.impl.UserAgeFilter;
import com.hxm.design.demo.service.impl.UserGenderFilter;
import lombok.Getter;
import lombok.Setter;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author hxmao
 * @date 2022/5/11 18:06
 */
@Setter
@Getter
public class EngineConfig {

    static Map<String, LogicFilter> logicFilterMap;

    static {
        logicFilterMap = new ConcurrentHashMap<>();
        logicFilterMap.put("userAge", new UserAgeFilter());
        logicFilterMap.put("userGender", new UserGenderFilter());
    }


}
