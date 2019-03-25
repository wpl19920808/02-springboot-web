package com.aisino.springboot.controller;

import com.aisino.springboot.model.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestfullController {
    //http://localhost:3036/boot/user/106/zhangsan
    @RequestMapping("/boot/user/{id}/{name}")
    public Object user(@PathVariable("id") Integer id, @PathVariable("name") String name){
        User user = new User();
        user.setID(id);
        user.setName(name);
        return user;
    }

    @RequestMapping("/boot/hello")
    public String hello(){
        return "hello";
    }
}
