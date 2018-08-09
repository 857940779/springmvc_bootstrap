package com.luohw.springmvc.core;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/xml")
public class XmlController {

    @ResponseBody
    @RequestMapping(value = "/15876512482",method = RequestMethod.GET)
    public String getXml(){
        String xml="<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                "<items>\n" +
                "<item id=\"SmsEnable\"><value>true</value></item>\n" +
                "<item id=\"BarEnable\"><value>false</value></item>\n" +
                "<item id=\"SoundEnable\"><value>false</value></item>\n" +
                "<item id=\"ShakeEnable\"><value>true</value></item>\n" +
                "<item id=\"OaEnable\"><value>true</value></item>\n" +
                "<item id=\"EmailEnable\"><value>true</value></item>\n" +
                "<item id=\"WifiEnable\"><value>true</value></item>\n" +
                "<item id=\"FontSize\"><value>13</value></item>\n" +
                "<item id=\"Language\"><value>1</value></item>\n" +
                "</items>";
        return xml;
    }

    @ResponseBody
    @RequestMapping(value = "/15876512482",method = RequestMethod.PUT)
    public String putXml(String xml){
        System.out.println(xml);

        return "success";
    }
}
