package com.nguyenphucthienan.springcore;

public class TrackCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Run 10 kilometers";
    }
}
