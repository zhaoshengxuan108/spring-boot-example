package com.egbert.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author 晟世青风
 * @title: CssController
 * @projectName spring-boot-example
 * @description: 两种解析CSS样式方法
 * @date 2019/4/24 16:24
 */

@Controller
public class CssController {

    @RequestMapping(value="/css", method= RequestMethod.GET)
    public String showStyle(Model model) {
        model.addAttribute("url", "<span style='color:red'>www.egbert.com</span>");
        return "css";
    }


    @RequestMapping(value="/show", method= RequestMethod.GET)
    public String show(Model model) {
        model.addAttribute("message", "显示跳转页面");
        return "show";
    }

}
