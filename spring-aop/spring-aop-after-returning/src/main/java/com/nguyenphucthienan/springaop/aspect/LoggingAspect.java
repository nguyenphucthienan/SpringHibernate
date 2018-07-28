package com.nguyenphucthienan.springaop.aspect;

import com.nguyenphucthienan.springaop.model.Account;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.List;

@Aspect
@Component
@Order(1)
public class LoggingAspect {
    @AfterReturning(pointcut = "execution(* com.nguyenphucthienan.springaop.dao.AccountDAO.findAccounts(..))",
            returning = "result")
    public void afterReturningFindAccountsAdvice(JoinPoint joinPoint, List<Account> result) {
        System.out.println("Executing @AfterReturning advice on method");
        System.out.println("Method: " + joinPoint.getSignature().toShortString());
        System.out.println("Result: " + result);

        convertAccountNameToUpperCase(result);
    }

    private void convertAccountNameToUpperCase(List<Account> accounts) {
        for (Account account : accounts) {
            account.setName(account.getName().toUpperCase());
        }
    }
}
