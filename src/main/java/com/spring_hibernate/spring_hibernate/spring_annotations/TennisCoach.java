package com.spring_hibernate.spring_hibernate.spring_annotations;

import com.spring_hibernate.spring_hibernate.ioc.Coach;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("thatSillyCoach")
@Scope("prototype")
public class TennisCoach implements Coach {

    @Override
    public String getDailyWorkOut() {
        return "Practice your backhand volley";
    }

    @Override
    public String getDailyFortune() {
        // TODO Auto-generated method stub
        return null;
    }
    
}
