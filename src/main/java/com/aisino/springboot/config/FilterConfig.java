package com.aisino.springboot.config;

import com.aisino.springboot.filter.hisFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//filter方法2：使用注册类
@Configuration
public class FilterConfig {

    @Bean
    public FilterRegistrationBean filterRegistrationBean(){
        FilterRegistrationBean registrationBean = new FilterRegistrationBean(new hisFilter());
        registrationBean.addUrlPatterns("/*");
        return registrationBean;
    }
}
