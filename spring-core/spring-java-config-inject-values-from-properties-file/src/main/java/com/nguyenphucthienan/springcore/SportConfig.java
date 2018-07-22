package com.nguyenphucthienan.springcore;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:sport.properties")
public class SportConfig {
    // Define bean for sadFortuneService
    @Bean
    public FortuneService sadFortuneService() {
        return new SadFortuneService();
    }

    // Define bean for swimCoach and inject dependency
    @Bean
    public Coach swimCoach() {
        return new SwimCoach(sadFortuneService());
    }
}
