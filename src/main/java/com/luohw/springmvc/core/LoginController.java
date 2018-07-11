package com.luohw.springmvc.core;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String login(String username,String password){
        //TODO  登陆校验
        System.out.println("========");
        System.out.println("login,username="+username+",password="+password);
        System.out.println("========");
        //登陆后跳转到首页
        return "index";
    }
}
