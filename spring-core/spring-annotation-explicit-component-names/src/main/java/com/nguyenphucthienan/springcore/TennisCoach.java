package com.nguyenphucthienan.springcore;

import org.springframework.stereotype.Component;

@Component("tCoach")
public class TennisCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Practice backhand volley";
    }
}
