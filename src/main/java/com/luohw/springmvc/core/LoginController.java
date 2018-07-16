package com.luohw.springmvc.core;

import com.luohw.springmvc.vo.user.UserVO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.HashMap;
import java.util.Map;

@Controller
public class LoginController {

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String login(ModelMap model, String password, String username){
        //TODO  登陆校验
        System.out.println("login");
        System.out.println(model);

        UserVO userVO=new UserVO();
        userVO.setUserName(username);

        model.addAttribute(userVO);
        model.addAttribute("name","testaaaaaa");
        //登陆后跳转到首页
        return "index";
    }
}
