package com.spring_hibernate.spring_hibernate.bean;

import com.spring_hibernate.spring_hibernate.ioc.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

    public static void main(String[] args) {

        //load the spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifecycle-applicationContext.xml");

        //retrieve bean from spring container
        Coach coach = context.getBean("trackCoach", Coach.class);
        Coach secondCoach = context.getBean("trackCoach", Coach.class);

        //check if they are same
        System.out.println("singleton bean: " + (coach == secondCoach));

        Coach protoCoach = context.getBean("protoTrackCoach", Coach.class);
        Coach secondProtoCoach = context.getBean("protoTrackCoach", Coach.class);

        System.out.println("prototype bean: " + (protoCoach == secondProtoCoach));

        context.close();
    }
}
