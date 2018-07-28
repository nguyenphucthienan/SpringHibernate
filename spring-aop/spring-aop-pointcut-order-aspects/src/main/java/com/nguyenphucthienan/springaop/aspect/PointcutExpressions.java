package com.nguyenphucthienan.springaop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class PointcutExpressions {
    @Pointcut("execution(* com.nguyenphucthienan.springaop.dao.*.*(..))")
    public void forDaoPackage() {
    }

    @Pointcut("execution(* com.nguyenphucthienan.springaop.dao.*.get*(..))")
    public void forGetter() {
    }

    @Pointcut("execution(* com.nguyenphucthienan.springaop.dao.*.set*(..))")
    public void forSetter() {
    }

    @Pointcut("forDaoPackage() && !(forGetter() || forSetter())")
    public void forDaoPackageNoGetterSetter() {
    }
}
