package com.timwheeler.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope("singleton")
public class TennisCoach implements Coach {

    @Autowired // field injection
    @Qualifier("randomFortuneService")
    private FortuneService fortuneService;

    @PostConstruct
    public void init() {
        System.out.println(">>> inside tennisCoach init()");
    }

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
    @PreDestroy
    public void destroy() {
        System.out.println(">>> inside tennisCoach destroy()");
    }


    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

}
