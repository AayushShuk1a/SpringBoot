package com.coachRoutine.CoachRoutine.rest;

import com.coachRoutine.CoachRoutine.common.Coach;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@Lazy
public class demoController {

    private Coach CricketCoach;
    //private Coach CricketCoach2;
    private Coach FootballCoach;
    private Coach ChessCoach;
    private Coach SwimCoach;

    //define the init constructor
    @PostConstruct
    public void atStartup(){
        System.out.println("Startup Executed");
    }
    //define the destroy constructor
    @PreDestroy
    public void atDestroy(){
        System.out.println("Destroy Executed");
    }

    //Constructor Injection
    @Autowired
    public demoController(@Qualifier("swimCoach") Coach swimCoach,@Qualifier("cricketCoach") Coach theCoach,@Qualifier("footballCoach") Coach footballCoach){
        System.out.println("In Constructor : "+ getClass().getSimpleName());
        CricketCoach=theCoach;
        FootballCoach=footballCoach;
        SwimCoach=swimCoach;
        //CricketCoach2=coachCricket;

    }




    //Setter Injection
    @Autowired
    public void setCoach(@Qualifier("chessCoach") Coach chessCoach){
        System.out.println("In Constructor : "+ getClass().getSimpleName());
        this.ChessCoach=chessCoach;
    }

    @GetMapping("/workoutcricket")
    public String getDailyWorkout(){
        return CricketCoach.getDailyWorkout();
    }


    @GetMapping("/workoutfootball")
    public String footballWorkout(){
       return FootballCoach.getDailyWorkout();
    }

    @GetMapping("/workoutchess")
    public String chessWorkout(){
        return ChessCoach.getDailyWorkout();
    }

    @GetMapping("/swim")
    public String swimWorkout(){
        return SwimCoach.getDailyWorkout();
    }

//    @GetMapping("/check")
//    public String check(){
//        return "CricketCoach==CricketCoach2 : "+(CricketCoach2==CricketCoach);
//    }

}
