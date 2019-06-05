package com.timwheeler.springdemo;

import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Throw 12 touchdown passes";
    }

    @Override
    public String getDailyFortune() {
        return "You will win the Super Bowl";
    }
}
