package com.nguyenphucthienan.springcore;

public class Main {
    public static void main(String[] args) {
        Coach coach = new BaseballCoach();

        System.out.println(coach.getDailyWorkout());
    }
}
