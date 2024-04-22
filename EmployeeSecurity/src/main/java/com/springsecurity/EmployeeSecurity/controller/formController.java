package com.springsecurity.EmployeeSecurity.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class formController {
    @GetMapping("/showLoginPage")
    public String LoginForm(){
        return "fancy-login";
    }


    
}
