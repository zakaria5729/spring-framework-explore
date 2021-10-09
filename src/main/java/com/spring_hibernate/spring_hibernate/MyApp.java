package com.spring_hibernate.spring_hibernate;

import com.spring_hibernate.spring_hibernate.ioc.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {
    
    public static void main(String[] args) {

        // Coach basketBallCoach = new BasketBallCoach();
        // System.out.println(basketBallCoach.getDailyWorkOut());

        // Coach trackCoach = new TrackCoach();
        // System.out.println(trackCoach.getDailyWorkOut());

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Coach trackCoach = context.getBean("trackCoach", Coach.class);
        System.out.println(trackCoach.getDailyWorkOut());;

        Coach basketballCoach = context.getBean("basketballCoach", Coach.class);
        System.out.println(basketballCoach.getDailyWorkOut());;

        ClassPathXmlApplicationContext annotationContext = new ClassPathXmlApplicationContext("beanAnnotation-applicationContext.xml");
        Coach tennisCoach = annotationContext.getBean("thatSillyCoach", Coach.class);
        System.out.println("component: " + tennisCoach.getDailyWorkOut());

        Coach defaultCoach = annotationContext.getBean("tennisCoachDefault", Coach.class);
        System.out.println("default: " + defaultCoach.getDailyWorkOut());

        annotationContext.close();
        context.close();
    }
}
