package com.DemoAop.AOP.Demo.Aspect;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(1)
public class MyDemoLogginAspect {

    @Before("com.DemoAop.AOP.Demo.Aspect.AopExpression.DaoPackageWithNoGetterSetter()")
    public void beforeAddAccount(){
        System.out.println("execution @Before addaccount from MyDemoLogginAspect");
    }


}
