package com.DemoAop.AOP.Demo.Aspect;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLogginAspect {

    @Pointcut("execution(* com.DemoAop.AOP.Demo.dao.*.*(..))")
    public void daoPackage(){};

    @Pointcut("execution(* com.DemoAop.AOP.Demo.dao.*.get*(..))")
    public void getter(){};

    @Pointcut("execution(* com.DemoAop.AOP.Demo.dao.*.set*(..))")
    public void setter(){};

    @Pointcut("daoPackage() && !(getter() || setter())")
    public void DaoPackageWithNoGetterSetter(){};

    @Before("DaoPackageWithNoGetterSetter()")
    public void beforeAddAccount(){
        System.out.println("execution @Before addaccount /n");
    }


}
