package com.nguyenphucthienan.springaop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
    @Pointcut("execution(* com.nguyenphucthienan.springaop.dao.*.*(..))")
    private void forDaoPackage() {
    }

    @Pointcut("execution(* com.nguyenphucthienan.springaop.dao.*.get*(..))")
    private void forGetter() {
    }

    @Pointcut("execution(* com.nguyenphucthienan.springaop.dao.*.set*(..))")
    private void forSetter() {
    }

    @Pointcut("forDaoPackage() && !(forGetter() || forSetter())")
    private void forDaoPackageNoGetterSetter() {
    }

    @Before("forDaoPackageNoGetterSetter()")
    public void beforeAddAccountAdvice() {
        System.out.println("Executing @Before advice on method");
    }
}
