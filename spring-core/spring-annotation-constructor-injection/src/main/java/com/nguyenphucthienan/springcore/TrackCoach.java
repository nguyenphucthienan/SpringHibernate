package com.nguyenphucthienan.springcore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach {
    private FortuneService fortuneService;

    @Autowired
    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Run 10 kilometers";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
