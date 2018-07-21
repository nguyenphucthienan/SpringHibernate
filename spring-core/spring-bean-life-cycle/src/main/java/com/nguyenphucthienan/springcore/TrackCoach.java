package com.nguyenphucthienan.springcore;

public class TrackCoach implements Coach {
    private FortuneService fortuneService;

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

    public void doMyStartUpStuff() {
        System.out.println("TrachCoach: inside method - doMyStartUpStuff");
    }

    public void doMyCleanUpStuff() {
        System.out.println("TrachCoach: inside method - doMyCleanUpStuff");
    }
}
