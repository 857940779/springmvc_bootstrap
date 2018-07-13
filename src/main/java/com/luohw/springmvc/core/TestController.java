package com.luohw.springmvc.core;

import com.alibaba.fastjson.JSON;
import com.luohw.springmvc.vo.user.UserVO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.*;

@Controller
@RequestMapping("/test")
public class TestController {

    @RequestMapping(value = "/test",method = RequestMethod.POST)
    @ResponseBody
    public String getTestData(){
       Map map=new HashMap<>();
       map.put("name","zhangsan");
       String str=JSON.toJSONString(map);
        System.out.println(str);
       return str;
    }
}
