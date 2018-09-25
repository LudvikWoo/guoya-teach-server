package com.example.wuling.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
    @RequestMapping("testAPI")
    public String sayHello(){
        return "你好，hello ！";
    }
}
