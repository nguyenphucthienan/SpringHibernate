package com.nguyenphucthienan.springcore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach {
    private FortuneService fortuneService;

    public BaseballCoach() {
        System.out.println("BaseballCoach: inside default constructor");
    }

    // @Autowired
    // public void setFortuneService(FortuneService fortuneService) {
    //     this.fortuneService = fortuneService;
    // }

    // Use any method name for dependency injection
    @Autowired
    public void doSomething(FortuneService fortuneService) {
        System.out.println("BaseballCoach: inside method - doSomething");
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Spend 30 minutes on batting practice";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
