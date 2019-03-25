package com.aisino.springboot.config;

import com.aisino.springboot.servlet.HisServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//servlet配置类，springboot没有xml，这个注解可以表示一个spring的xml配置文件
@Configuration
public class ServletConfig {
    @Bean
    public ServletRegistrationBean hisServletRegistartionBean(){
        ServletRegistrationBean registrationBean = new ServletRegistrationBean((new HisServlet()), "/servlet/hisservlet");
        return registrationBean;
    }
}
