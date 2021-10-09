package com.spring_hibernate.spring_hibernate.di;

public class HappyFortuneServiceImpl implements FortuneService {

    @Override
    public String getFortune() {
        return "Today is your lucky day";
    }
}
