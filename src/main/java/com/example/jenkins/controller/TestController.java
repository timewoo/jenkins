package com.example.jenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yanglin
 * @date 2019/10/12
 */
@RestController
public class TestController {


    @GetMapping("/test")
    public String test(){
        return "hello World!";
    }
}
