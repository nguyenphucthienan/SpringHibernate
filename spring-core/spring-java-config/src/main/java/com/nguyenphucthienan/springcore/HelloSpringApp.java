package com.nguyenphucthienan.springcore;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HelloSpringApp {
    public static void main(String[] args) {
        // Load the Spring configuration file
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

        // Retrieve bean from Spring container
        Coach coach = context.getBean("tennisCoach", Coach.class);

        // Call method on the bean
        System.out.println(coach.getDailyWorkout());

        // Close the context
        context.close();
    }
}
