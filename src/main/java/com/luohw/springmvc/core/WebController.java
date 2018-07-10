package com.luohw.springmvc.core;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {

	@RequestMapping("/")
	public String index(){
		System.out.println("========");
		return "login";
	}
	
}
