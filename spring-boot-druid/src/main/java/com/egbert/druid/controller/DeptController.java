package com.egbert.druid.controller;

import com.egbert.druid.service.IDeptService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class DeptController {

	@Resource
	private IDeptService deptService;
	
	@RequestMapping(value="/list", method= RequestMethod.GET)
	@ResponseBody
	public Object echo() {
		return deptService.list();
	}
	
}
