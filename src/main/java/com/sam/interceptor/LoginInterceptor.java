package com.sam.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * springboot_jxc
 * 登录拦截器
 *
 * @author Sam_T
 * @date 2020-04-01 21:54
 */
public class LoginInterceptor implements HandlerInterceptor {
    /**
     * 在请求处理之前进行调用（controller方法调用之前）,
     *
     * @param request
     * @param response
     * @param handler
     * @return boolean
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        //如果session中不存在userName，也就是没有登陆就拦截
        Object userName = request.getSession().getAttribute("userName");
        if (userName == null) {
            return false;
        }

        return true;
    }

    /**
     * 请求处理之后进行调用，但在视图被渲染之前（调用controller之后）
     *
     * @param request
     * @param response
     * @param handler
     * @return void
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    /**
     * 整个请求结束后被调用，也就是渲染完视图之后执行
     *
     * @param request
     * @param response
     * @param handler
     * @return void
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
