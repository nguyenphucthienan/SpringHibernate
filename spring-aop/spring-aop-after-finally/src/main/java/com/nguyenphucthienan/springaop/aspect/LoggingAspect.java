package com.nguyenphucthienan.springaop.aspect;

import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(1)
public class LoggingAspect {
    @After("execution(* com.nguyenphucthienan.springaop.dao.AccountDAO.findAccounts(..))")
    public void afterFindAccountsAdvice() {
        System.out.println("Executing @After (finally) advice on method");
    }
}
