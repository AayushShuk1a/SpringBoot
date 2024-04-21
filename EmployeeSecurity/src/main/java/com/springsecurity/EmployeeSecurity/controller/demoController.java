package com.springsecurity.EmployeeSecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class demoController {

    @GetMapping("/")
    public String Home(){
        return "Home";
    }
}
