package com.coachRoutine.CoachRoutine.common;


//import org.springframework.beans.factory.config.ConfigurableBeanFactory;
//import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("cricketCoach")
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)

public class CricketCoach implements Coach{

    public CricketCoach(){
        System.out.println("In Constructor : "+getClass().getSimpleName());
    }


    @Override
    public String getDailyWorkout() {
        return "practise 4 hours on the ground";
    }
}
