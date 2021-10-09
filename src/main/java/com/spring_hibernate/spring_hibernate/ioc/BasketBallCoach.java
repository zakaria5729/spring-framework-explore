package com.spring_hibernate.spring_hibernate.ioc;

import com.spring_hibernate.spring_hibernate.di.FortuneService;

public class BasketBallCoach implements Coach {

    private FortuneService fortuneService;

    public BasketBallCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkOut() {
        return "Spend 30 minutes of batting practice";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
