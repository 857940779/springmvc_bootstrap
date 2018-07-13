package com.luohw.springmvc.core;

import com.alibaba.fastjson.JSON;
import com.luohw.springmvc.vo.user.UserVO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public String userList(){
        return "/user/user_list";
    }


    @RequestMapping("/page")
    @ResponseBody
    public String getUserPage(){
        List list=new ArrayList<>();
        for(int i=1;i<=10;i++){
            UserVO userVO=new UserVO();
            userVO.setUserName("user--"+i);
            userVO.setRegisterTime(new Date());
            userVO.setRoleId(i%3);
            userVO.setState(i%3);
            list.add(userVO);
        }

        return JSON.toJSONString(list);
    }

}
