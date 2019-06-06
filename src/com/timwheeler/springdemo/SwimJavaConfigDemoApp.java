package com.timwheeler.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {

    public static void main(String[] args) {

        // read spring config
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

        // get the bean from the spring container
        SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class);

        // call a method on the bean
        System.out.println(theCoach.getDailyWorkout());

        // call method to get daily fortune
        System.out.println(theCoach.getDailyFortune());
        // close the context

        // call new getEmail method
        System.out.println("Email: " + theCoach.getEmail());

        // call new getTeam method
        System.out.println("Team: " + theCoach.getTeam());

        context.close();
    }

}
