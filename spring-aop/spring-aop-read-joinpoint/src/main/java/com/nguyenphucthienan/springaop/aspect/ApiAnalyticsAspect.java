package com.nguyenphucthienan.springaop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(2)
public class ApiAnalyticsAspect {
    @Before("com.nguyenphucthienan.springaop.aspect.PointcutExpressions.forDaoPackageNoGetterSetter()")
    public void performApiAnalyticsAdvice() {
        System.out.println("Performing API analytics");
    }
}
