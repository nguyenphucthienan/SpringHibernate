package com.nguyenphucthienan.springaop;

import com.nguyenphucthienan.springaop.config.JavaConfig;
import com.nguyenphucthienan.springaop.serivce.TrafficFortuneService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);

        TrafficFortuneService trafficFortuneService = context.getBean("trafficFortuneService",
                TrafficFortuneService.class);

        System.out.println(trafficFortuneService.getFortune());

        context.close();
    }
}
