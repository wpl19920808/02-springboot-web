package com.aisino.springboot.config;

import com.aisino.springboot.interceptor.LoginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration//变成配置类
public class WebConfig extends WebMvcConfigurerAdapter {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        /*InterceptorRegistration interceptorRegistration = registry.addInterceptor(new LoginInterceptor());// 注册拦截器
        interceptorRegistration.addPathPatterns();//拦截路径
        interceptorRegistration.excludePathPatterns();//不拦截路径   一般写一行*/

        String[] addPathPatterns = {
                "/boot/**"
        };// 需要拦截的路径，一般是数组
        String[] excludePathPatterns = {
                "/boot/hello"
        };//不拦截的路径，一般也是数组

        // 注册Login拦截器
        registry.addInterceptor(new LoginInterceptor()).addPathPatterns(addPathPatterns).excludePathPatterns(excludePathPatterns);
    }
}
