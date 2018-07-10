package com.luohw.springmvc.core;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String login(){
        System.out.println("========");
        System.out.println("login");
        System.out.println("========");
        //登陆后跳转到首页
        return "company";
    }
}
