package com.anji.springbootjwt.controller;

import com.anji.springbootjwt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description:
 * author: chenqiang
 * date: 2018/6/13 10:57
 */
@RestController
@RequestMapping(value = "/api")
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping(value = "/user")
    public String getUser() throws Exception{
        return "user appid";
    }
}
