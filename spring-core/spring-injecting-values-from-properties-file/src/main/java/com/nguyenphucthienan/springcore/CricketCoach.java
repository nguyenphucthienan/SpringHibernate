package com.nguyenphucthienan.springcore;

public class CricketCoach implements Coach {
    private FortuneService fortuneService;

    private String emailAddress;
    private String team;

    // Create no-arg constructor
    public CricketCoach() {
        System.out.println("CricketCoach: inside no-arg constructor");
    }

    // Define setter method for dependency injection
    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("CricketCoach: inside setter method - setFortuneService");
        this.fortuneService = fortuneService;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        System.out.println("CricketCoach: inside setter method - setEmailAddress");
        this.emailAddress = emailAddress;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        System.out.println("CricketCoach: inside setter method - setTeam");
        this.team = team;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
