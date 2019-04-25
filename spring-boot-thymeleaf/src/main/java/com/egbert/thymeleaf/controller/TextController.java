package com.egbert.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 晟世青风
 * @title: TextController
 * @projectName spring-boot-example
 * @description: TODO
 * @date 2019/4/24 16:08
 */
@Controller
public class TextController {

    @RequestMapping("/")
    public String index(ModelMap map) {
        map.addAttribute("welcome", "欢迎使用Thymeleaf！");
        return "home";
    }

}
