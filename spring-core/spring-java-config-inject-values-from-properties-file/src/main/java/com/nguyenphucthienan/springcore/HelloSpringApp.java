package com.nguyenphucthienan.springcore;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HelloSpringApp {
    public static void main(String[] args) {
        // Load the Spring configuration file
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

        // Retrieve bean from Spring container
        SwimCoach swimCoach = context.getBean("swimCoach", SwimCoach.class);

        // Call methods on the bean
        System.out.println(swimCoach.getDailyWorkout());
        System.out.println(swimCoach.getDailyFortune());
        System.out.println(swimCoach.getEmail());
        System.out.println(swimCoach.getTeam());

        // Close the context
        context.close();
    }
}
