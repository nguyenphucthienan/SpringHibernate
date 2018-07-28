package com.nguyenphucthienan.springaop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(3)
public class CloudLoggingAspect {
    @Before("com.nguyenphucthienan.springaop.aspect.PointcutExpressions.forDaoPackageNoGetterSetter()")
    public void logToCloudAdvice() {
        System.out.println("Logging to cloud");
    }
}
