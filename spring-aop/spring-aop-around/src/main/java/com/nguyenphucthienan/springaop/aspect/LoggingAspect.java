package com.nguyenphucthienan.springaop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(1)
public class LoggingAspect {
    @Around("execution(* com.nguyenphucthienan.springaop.serivce.*.getFortune(..))")
    public Object aroundFindAccountsAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("Executing @Around advice on method");

        long beginTime = System.currentTimeMillis();

        Object result = proceedingJoinPoint.proceed();

        long endTime = System.currentTimeMillis();

        System.out.println("Duration: " + (endTime - beginTime) / 1000);

        return result;
    }
}
