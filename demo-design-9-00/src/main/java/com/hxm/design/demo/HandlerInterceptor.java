package com.hxm.design.demo;

/**
 * @author hxmao
 * @date 2022/5/12 17:51
 */
public interface HandlerInterceptor {

    boolean preHandle(String request, String response, Object handler);
}
