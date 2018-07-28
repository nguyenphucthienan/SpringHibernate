package com.nguyenphucthienan.springmvc.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Aspect
@Component
public class LoggingAspect {
    private Logger logger = Logger.getLogger(LoggingAspect.class.getName());

    @Pointcut("execution(* com.nguyenphucthienan.springmvc.controller.*.*(..))")
    private void forControllerPackage() {
    }

    @Pointcut("execution(* com.nguyenphucthienan.springmvc.service.*.*(..))")
    private void forServicePackage() {
    }

    @Pointcut("execution(* com.nguyenphucthienan.springmvc.dao.*.*(..))")
    private void forDaoPackage() {
    }

    @Pointcut("forControllerPackage() || forServicePackage() || forDaoPackage()")
    private void forAppFlow() {
    }

    @Before("forAppFlow()")
    public void beforeAdvice(JoinPoint joinPoint) {
        logger.info("Method: " + joinPoint.getSignature());
        for (Object argument : joinPoint.getArgs()) {
            logger.info("Argument: " + argument.toString());
        }
    }

    @AfterReturning(pointcut = "forAppFlow()", returning = "result")
    public void afterReturningAdvice(JoinPoint joinPoint, Object result) {
        logger.info("Method: " + joinPoint.getSignature());
        logger.info("Result: " + result);
    }
}
