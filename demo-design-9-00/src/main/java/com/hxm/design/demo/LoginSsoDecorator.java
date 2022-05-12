package com.hxm.design.demo;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author hxmao
 * @date 2022/5/12 17:58
 */
public class LoginSsoDecorator extends SsoInterceptor{

    private static Map<String, String> authMap = new ConcurrentHashMap<>();

    static {
        authMap.put("huahua", "queryUserInfo");
        authMap.put("doudou", "queryUserInfo");
    }

    @Override
    public boolean preHandle(String request, String response, Object handler) {

        // 模拟获取cookie
        String ticket = request.substring(1, 8);
        // 模拟校验
        boolean success = ticket.equals("success");
        if (!success) return false;
        String userId = request.substring(9);
        String method = authMap.get(userId);
        // 模拟⽅法校验
        return "queryUserInfo".equals(method);
    }
}
