package com.egbert.first.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class TestControoler {

    @RequestMapping("/demo")
    @ResponseBody
    public Map<String, Object> demo() {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("id", 1);
        map.put("name", "zhaoliang");
        return map;
    }

}
