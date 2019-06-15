package com.egbert.first.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SimpleController {

    @RequestMapping("/test")
    @ResponseBody
    public String home() {
        return "Hello hahaha - test!";
    }

}
