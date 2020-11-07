package com.main.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerClass {

    @GetMapping(value = "/get")
    public String getMethod(){
        return "This is Get Method";
    }

    @GetMapping(value = "/get2")
    public String getMethod2(){
        return "This is Get Method 2";
    }
}
