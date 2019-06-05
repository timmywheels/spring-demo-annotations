package com.timwheeler.springdemo;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService {

    // create an array of strings
    private String[] data = {
            "Squash some bugs",
            "Sustaining Engineering",
            "Tier 3"

    };

    // create a random number generator
    private Random random = new Random();


    @Override
    public String getFortune() {

        int index = random.nextInt(data.length);

        String theFortune = data[index];

        return theFortune;
    }
        // pick random string from the array
}
