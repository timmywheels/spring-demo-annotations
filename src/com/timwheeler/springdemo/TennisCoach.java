package com.timwheeler.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

    @Autowired // field injection
    private FortuneService fortuneService;

    // define a default constructor
    public TennisCoach() {
        System.out.println(">>> inside default constructor");
    }

    // define a setter method
//    @Autowired // setter injection
//    public void setFortuneService(FortuneService fortuneService) {
//        System.out.println(">>> inside setFortuneService()");
//        this.fortuneService = fortuneService;
//    }

//    @Autowired // constructor injection
//    public TennisCoach(FortuneService fortuneService) {
//        this.fortuneService = fortuneService;
//    }

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

}
