package com.aisino.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

//扫描注解的包（可以多个，servlet一个，filter一个）
@ServletComponentScan(basePackages = {"com.aisino.springboot.servlet", "com.aisino.springboot.filter"})
@SpringBootApplication
public class SpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootApplication.class, args);
    }

}
