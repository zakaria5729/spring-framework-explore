package com.spring_hibernate.spring_hibernate.di;

import com.spring_hibernate.spring_hibernate.ioc.Coach;

public class CricketCoach implements Coach {

    public CricketCoach() {
        System.out.println("Cricket coach: inside no argument constructor");
    }

    private FortuneService fortuneService;

    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("Cricket coach: inside setter method");
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkOut() {
        return "Practice fast bowling for 15 minutes";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
