package com.demothymeleaf.DempThyeleaf.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class demoController {

    @GetMapping("/hello")
    public String SayHello(Model theModel){
        theModel.addAttribute("theDate",java.time.LocalTime.now());
        return "helloworld";
    }



}
