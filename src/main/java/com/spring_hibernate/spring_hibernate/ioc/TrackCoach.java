package com.spring_hibernate.spring_hibernate.ioc;

public class TrackCoach implements Coach {

    @Override
    public String getDailyWorkOut() {
        return "Run a hard 5k";
    }
}
