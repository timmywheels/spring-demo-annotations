package com.timwheeler.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Configuration
//@ComponentScan("com.timwheeler.springdemo")
@PropertySource("classpath:sport.properties")
public class SportConfig {

    // define bean for sad fortune service
    @Bean
    public FortuneService sadFortuneService() {
        return new SadFortuneService();
    }

    // define bean for swim coach
    // and inject dependency
    @Bean
    public SwimCoach swimCoach() {
        return new SwimCoach(sadFortuneService());
    }

}
