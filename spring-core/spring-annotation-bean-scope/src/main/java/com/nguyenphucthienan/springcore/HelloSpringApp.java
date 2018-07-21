package com.nguyenphucthienan.springcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {
    public static void main(String[] args) {
        // Load the Spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Retrieve bean from Spring container
        Coach coach1 = context.getBean("baseballCoach", Coach.class);
        Coach coach2 = context.getBean("baseballCoach", Coach.class);

        // Check if they are the same bean
        System.out.println("Pointing to the same object: " + (coach1 == coach2));
        System.out.println("Memory location for coach1 " + coach1);
        System.out.println("Memory location for coach2 " + coach2);

        // Close the context
        context.close();
    }
}
