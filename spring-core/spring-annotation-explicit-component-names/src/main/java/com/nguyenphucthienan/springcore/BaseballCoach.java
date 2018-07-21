package com.nguyenphucthienan.springcore;

import org.springframework.stereotype.Component;

@Component("bCoach")
public class BaseballCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Spend 30 minutes on batting practice";
    }
}
