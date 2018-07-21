package com.nguyenphucthienan.springcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {
    public static void main(String[] args) {
        // Load the Spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Retrieve bean from Spring container
        Coach coach = context.getBean("tennisCoach", Coach.class);

        // Call method on the bean
        System.out.println(coach.getDailyWorkout());

        // Close the context
        context.close();
    }
}
