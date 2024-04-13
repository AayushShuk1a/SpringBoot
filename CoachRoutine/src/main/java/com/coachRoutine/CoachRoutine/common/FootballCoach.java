package com.coachRoutine.CoachRoutine.common;



import org.springframework.stereotype.Component;

@Component("footballCoach")

public class FootballCoach implements Coach {


    public FootballCoach(){
        System.out.println("In Constructor : "+getClass().getSimpleName());
    }


    @Override
    public String getDailyWorkout() {
        return "Practise for 8 hours on the field";
    }
}
