package com.sam.interceptor;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * springboot_jxc
 * 设置拦截的请求
 *
 * @author Sam_T
 * @date 2020-04-01 21:37
 */
@Configuration
public class InterceptionRequest extends WebMvcConfigurationSupport {
    /**
     * 在springboot2.0.0之后继承WebMvcConfigurationSupport类，重写addInterceptors方法
     * 
     * @param registry 原方法参数
     * @return void
     */
    @Override
    protected void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginInterceptor()).addPathPatterns("/**").excludePathPatterns("/login");
        
        super.addInterceptors(registry);
    }
}
