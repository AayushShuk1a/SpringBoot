package com.coachRoutine.CoachRoutine.config;

import com.coachRoutine.CoachRoutine.common.Coach;
import com.coachRoutine.CoachRoutine.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportsConfig {

    @Bean("swimCoach")
    public Coach swimCoach(){
        return new SwimCoach();
    }
}
