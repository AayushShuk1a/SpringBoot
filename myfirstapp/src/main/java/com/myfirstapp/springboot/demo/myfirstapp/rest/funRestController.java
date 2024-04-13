package com.myfirstapp.springboot.demo.myfirstapp.rest;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class funRestController {


    @Value("${coach.name}")
    private String coach;

    @Value("${team.name}")
    private String team;

    @GetMapping("/")
    public String sayHello(){
        return "Hello World";
    }

    @GetMapping("/workout")
    public String DailyWorkout(){
        return "Run daily 5K";
    }




    @GetMapping("/team")
    public String getTeams()
    {
        return "Coach Name "+coach+" ,Team Name "+team;
    }
}
