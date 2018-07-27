package com.nguyenphucthienan.springaop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
    @Before("execution(* add*())")
    // @Before("execution(public void add*())")
    // @Before("execution(public void addAccount())")
    // @Before("execution(public void com.nguyenphucthienan.springaop.dao.AccountDAO.addAccount())")
    public void beforeAddAccountAdvice() {
        System.out.println("Executing @Before advice on method");
    }
}
