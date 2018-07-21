package com.nguyenphucthienan.springcore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class BaseballCoach implements Coach {
    @Autowired
    @Qualifier("randomFortuneService")
    private FortuneService fortuneService;

    public BaseballCoach() {
        System.out.println("BaseballCoach: inside default constructor");
    }

    @PostConstruct
    public void doMyStartUpStuff() {
        System.out.println("BaseballCoach: inside method - doMyStartUpStuff");

    }

    @PreDestroy
    public  void doMyCleanUpStuff() {
        System.out.println("BaseballCoach: inside method - doMyCleanUpStuff");
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
