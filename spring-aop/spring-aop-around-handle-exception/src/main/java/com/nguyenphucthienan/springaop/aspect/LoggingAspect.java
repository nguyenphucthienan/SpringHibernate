package com.nguyenphucthienan.springaop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Aspect
@Component
@Order(1)
public class LoggingAspect {
    private Logger logger = Logger.getLogger(LoggingAspect.class.getName());

    @Around("execution(* com.nguyenphucthienan.springaop.serivce.*.getFortune(..))")
    public Object aroundFindAccountsAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        logger.info("Executing @Around advice on method");
        long beginTime = System.currentTimeMillis();

        Object result;
        try {
            result = proceedingJoinPoint.proceed();
        } catch (Exception e) {
            logger.warning(e.getMessage());
            result = "Exception was handled by AOP!";
        }

        long endTime = System.currentTimeMillis();
        logger.info("Duration: " + (endTime - beginTime) / 1000);

        return result;
    }
}
