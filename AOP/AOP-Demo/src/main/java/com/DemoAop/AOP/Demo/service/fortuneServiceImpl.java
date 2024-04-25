package com.DemoAop.AOP.Demo.service;


import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
public class fortuneServiceImpl implements FortuneService {
    @Override
    public String getFortune() {

        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        return "You will have a great Day";
    }

    @Override
    public String getFortune(boolean tripWire) {

        if(tripWire){
            throw new RuntimeException("A exception");
        }

        return "fortune is good";
    }
}
