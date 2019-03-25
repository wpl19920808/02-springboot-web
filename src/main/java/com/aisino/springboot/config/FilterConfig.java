package com.aisino.springboot.config;

import com.aisino.springboot.filter.hisFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.CharacterEncodingFilter;

//filter方法2：使用注册类
@Configuration
public class FilterConfig {

    @Bean
    public FilterRegistrationBean filterRegistrationBean(){
        FilterRegistrationBean registrationBean = new FilterRegistrationBean(new hisFilter());
        registrationBean.addUrlPatterns("/*");
        return registrationBean;
    }

    //乱码解决方法1（更好是在properties中配置）
    //过滤器设置字符编码，等价于在web.xml中设置的过滤器
    //实际情况的乱码可能比较复杂，有时候过滤器不一定解决问题，比如linux系统，tomcat编码等等
    //--------------------需要在spring.http.encoding.enabled=false才能使用---------------
    @Bean
    public FilterRegistrationBean encodingFilterRegistrationBean(){
        FilterRegistrationBean registrationBean = new FilterRegistrationBean();
        CharacterEncodingFilter characterEncodingFilter = new CharacterEncodingFilter();
        characterEncodingFilter.setForceEncoding(true);
        characterEncodingFilter.setEncoding("GBK");
        registrationBean.setFilter(characterEncodingFilter);
        registrationBean.addUrlPatterns("/*");
        return registrationBean;
    }
}
