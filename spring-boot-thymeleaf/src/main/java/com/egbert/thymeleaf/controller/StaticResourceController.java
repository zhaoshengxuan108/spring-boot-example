package com.egbert.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author 晟世青风
 * @title: StaticResourceController
 * @projectName spring-boot-example
 * @description: TODO
 * @date 2019/4/24 16:24
 */

@Controller
public class StaticResourceController {

    @RequestMapping(value="/static", method= RequestMethod.GET)
    public String showStyle(Model model) {
        model.addAttribute("url", "<span style='color:red'>www.egbert.com</span>");
        return "static_resource";
    }

}
