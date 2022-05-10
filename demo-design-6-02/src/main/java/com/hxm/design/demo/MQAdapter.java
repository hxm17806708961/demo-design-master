package com.hxm.design.demo;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;

/**
 * @author hxmao
 * @date 2022/5/10 16:50
 */
public class MQAdapter {

    public static RebateInfo filter(Map obj, Map<String, String> link)
            throws NoSuchMethodException, InvocationTargetException,
            IllegalAccessException {

        RebateInfo rebateInfo = new RebateInfo();
        for (String key :
                link.keySet()) {
            Object val = obj.get(link.get(key));

            RebateInfo.class.getMethod("set" + key.substring(0,1).toUpperCase() + key.substring(1), String.class)
                    .invoke(rebateInfo, val.toString());
        }
        return rebateInfo;

    }
}
