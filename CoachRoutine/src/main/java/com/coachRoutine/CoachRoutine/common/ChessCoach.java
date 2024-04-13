package com.coachRoutine.CoachRoutine.common;


import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("chessCoach")
//@Lazy
public class ChessCoach implements Coach{


    public ChessCoach(){
        System.out.println("In Constructor : "+getClass().getSimpleName());
    }


    @Override
    public String getDailyWorkout() {
        return "Practise for 10 hours Daily";
    }
}
