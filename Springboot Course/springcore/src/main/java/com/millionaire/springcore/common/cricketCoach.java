package com.millionaire.springcore.common;

import org.springframework.stereotype.Component;

@Component
public class cricketCoach implements Coach {

    @Override
    public String getDailyWorkout(){
        return "Jogging for 30 minutes as a HIIT workout :test-";
    }
}
