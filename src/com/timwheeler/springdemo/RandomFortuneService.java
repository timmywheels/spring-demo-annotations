package com.timwheeler.springdemo;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService {

    @PostConstruct
    public void init() {
        System.out.println(">>> inside RandomFortuneService init()");
    }

    // create an array of strings
    private String[] data = {
            "Squash some bugs",
            "Sustaining Engineering",
            "Tier 3"

    };

    // create a random number generator
    private Random random = new Random();


    // pick random string from the array
    @Override
    public String getFortune() {

        int index = random.nextInt(data.length);

        String theFortune = data[index];

        return theFortune;
    }

    @PreDestroy
    public void destroy() {
        System.out.println(">>> inside RandomFortuneService destroy()");
    }

}
