package com.nguyenphucthienan.springcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {
    public static void main(String[] args) {
        // Load the Spring configuration file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

        // Retrieve bean from Spring container
        Coach coach1 = context.getBean("coach", Coach.class);
        Coach coach2 = context.getBean("coach", Coach.class);

        // Check if they are the same bean
        System.out.println("Pointing to the same object: " + (coach1 == coach2));
        System.out.println("Memory location for coach1 " + coach1);
        System.out.println("Memory location for coach2 " + coach2);

        // Close the context
        context.close();
    }
}
