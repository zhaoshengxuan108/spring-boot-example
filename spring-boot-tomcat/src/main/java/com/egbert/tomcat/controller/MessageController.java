package com.egbert.tomcat.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

	@RequestMapping(value="/")
	@ResponseBody
	public String index() {
		return "aaaaaa";
	}
	
	@RequestMapping(value="/echo")
	@ResponseBody
	public String echo() {
		System.out.println("【*** echo ***】");
		return "【*** echo ***】";
	}
	
}
