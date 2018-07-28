package com.nguyenphucthienan.springaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(1)
public class LoggingAspect {
    @AfterThrowing(pointcut = "execution(* com.nguyenphucthienan.springaop.dao.AccountDAO.findAccounts(..))",
            throwing = "exception")
    public void afterThrowingFindAccountsAdvice(JoinPoint joinPoint, Throwable exception) {
        System.out.println("Executing @AfterThrowing advice on method");
        System.out.println("Method: " + joinPoint.getSignature().toShortString());
        System.out.println("Exception: " + exception);
    }
}
