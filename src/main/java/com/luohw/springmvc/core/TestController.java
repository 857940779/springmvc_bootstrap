package com.luohw.springmvc.core;

import com.alibaba.fastjson.JSON;
import com.luohw.springmvc.vo.user.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.*;

@Controller
@RequestMapping("/test")
public class TestController {

    @Autowired
    private KafkaTemplate kafkaTemplate;

    @RequestMapping(value = "/test",method = RequestMethod.POST)
    @ResponseBody
    public String getTestData(){
       Map map=new HashMap<>();
       map.put("name","zhangsan");
       String str=JSON.toJSONString(map);
        System.out.println(str);
       return str;
    }

    @RequestMapping(value = "/kafkaSend", method = RequestMethod.GET)
    @ResponseBody
    public String save() {
        System.out.println("-----------------------------");
        //kafkaTemplate.sendDefault("KAFKA分布式消息服务测试");
        kafkaTemplate.send("kafkaTest","this is a new topic message");

        return "test is success";
    }

}
