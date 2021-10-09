package com.spring_hibernate.spring_hibernate.ioc;

public class TrackCoach implements Coach {

    @Override
    public String getDailyWorkOut() {
        return "Run a hard 5k";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }

    //add an init method
    public void doMyStatupStuff() {
        System.out.println("Inside method doMyStatupStuff");
    }

    //add a destroy method
    public void doMyCleanUpStuff() {
        System.out.println("Inside method doMyCleanUpStuff");
    }

}
