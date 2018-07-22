package com.nguyenphucthienan.springcore;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HelloSpringApp {
    public static void main(String[] args) {
        // Load the Spring configuration file
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

        // Retrieve bean from Spring container
        Coach coach = context.getBean("swimCoach", Coach.class);

        // Call methods on the bean
        System.out.println(coach.getDailyWorkout());
        System.out.println(coach.getDailyFortune());

        // Close the context
        context.close();
    }
}
