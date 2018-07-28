package com.nguyenphucthienan.springaop;

import com.nguyenphucthienan.springaop.config.JavaConfig;
import com.nguyenphucthienan.springaop.serivce.TrafficFortuneService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.logging.Logger;

public class MainApp {
    private static Logger logger = Logger.getLogger(MainApp.class.getName());

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);

        TrafficFortuneService trafficFortuneService = context.getBean("trafficFortuneService",
                TrafficFortuneService.class);

        // MainApp will never know about the exception
        logger.info(trafficFortuneService.getFortune(true));

        context.close();
    }
}
