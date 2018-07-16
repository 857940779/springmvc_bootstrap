package com.luohw.springmvc.core;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/area")
public class AreaController {

    @RequestMapping("/list")
    public ModelAndView goToList(){
//        return new ModelAndView("/area/list");
        return new ModelAndView("/area/list","message","helloworld");
    }

//    @RequestMapping("/list")
//    public String goToList(){
//        return "/area/list";
//    }
}
