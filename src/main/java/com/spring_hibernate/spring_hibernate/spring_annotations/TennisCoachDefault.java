package com.spring_hibernate.spring_hibernate.spring_annotations;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import com.spring_hibernate.spring_hibernate.ioc.Coach;

@Component
public class TennisCoachDefault implements Coach {

    @Override
    public String getDailyWorkOut() {
        return "Practice your backhand volley from default";
    }

    @Override
    public String getDailyFortune() {
        // TODO Auto-generated method stub
        return null;
    }
    

    //add an init method
    @PostConstruct
    public void doMyStatupStuff() {
        System.out.println("TennisCoachDefault ==> Inside method doMyStatupStuff");
    }

    //add a destroy method
    @PreDestroy
    public void doMyCleanUpStuff() {
        System.out.println("TennisCoachDefault ==> Inside method doMyCleanUpStuff");
    }
}
