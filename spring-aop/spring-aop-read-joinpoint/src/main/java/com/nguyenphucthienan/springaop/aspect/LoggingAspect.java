package com.nguyenphucthienan.springaop.aspect;

import com.nguyenphucthienan.springaop.model.Account;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(1)
public class LoggingAspect {
    @Before("com.nguyenphucthienan.springaop.aspect.PointcutExpressions.forDaoPackageNoGetterSetter()")
    public void beforeAddAccountAdvice(JoinPoint joinPoint) {
        System.out.println("Executing @Before advice on method");

        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println("Method signature: " + methodSignature);

        Object[] arguments = joinPoint.getArgs();

        for (Object argument : arguments) {
            System.out.println(argument);
            if (argument instanceof Account) {
                Account account = (Account) argument;
                System.out.println(account.getName() + " - " + account.getLevel());
            }
        }
    }
}
