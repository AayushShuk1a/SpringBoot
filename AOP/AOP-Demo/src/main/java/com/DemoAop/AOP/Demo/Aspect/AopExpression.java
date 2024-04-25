package com.DemoAop.AOP.Demo.Aspect;

import org.aspectj.lang.annotation.Pointcut;

public class AopExpression {

    @Pointcut("execution(* com.DemoAop.AOP.Demo.dao.*.*(..))")
    public void daoPackage(){};

    @Pointcut("execution(* com.DemoAop.AOP.Demo.dao.*.get*(..))")
    public void getter(){};

    @Pointcut("execution(* com.DemoAop.AOP.Demo.dao.*.set*(..))")
    public void setter(){};

    @Pointcut("daoPackage() && !(getter() || setter())")
    public void DaoPackageWithNoGetterSetter(){};
}
