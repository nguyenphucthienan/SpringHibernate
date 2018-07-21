package com.nguyenphucthienan.springcore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach {
    @Autowired
    @Qualifier("happyFortuneService")
    private FortuneService fortuneService;

    @Override
    public String getDailyWorkout() {
        return "Run 10 kilometers";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
