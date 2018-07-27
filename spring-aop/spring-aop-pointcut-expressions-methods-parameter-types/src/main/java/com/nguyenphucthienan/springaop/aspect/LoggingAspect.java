package com.nguyenphucthienan.springaop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
    // @Before("execution(* add*(..))")
    // @Before("execution(* add*(*))")
    @Before("execution(* com.nguyenphucthienan.springaop.dao.*.*(..))")
    // @Before("execution(* add*(com.nguyenphucthienan.springaop.model.Account))")
    // @Before("execution(* add*(com.nguyenphucthienan.springaop.model.Account, ..))")
    public void beforeAddAccountAdvice() {
        System.out.println("Executing @Before advice on method");
    }
}
