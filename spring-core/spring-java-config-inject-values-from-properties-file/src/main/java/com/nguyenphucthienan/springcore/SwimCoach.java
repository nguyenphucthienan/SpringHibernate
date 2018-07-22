package com.nguyenphucthienan.springcore;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {
    private FortuneService fortuneService;

    @Value("${npta.email}")
    private String email;

    @Value("${npta.team}")
    private String team;

    public SwimCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public String getEmail() {
        return email;
    }

    public String getTeam() {
        return team;
    }

    @Override
    public String getDailyWorkout() {
        return "Swim 1000 meters as a warm up";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
