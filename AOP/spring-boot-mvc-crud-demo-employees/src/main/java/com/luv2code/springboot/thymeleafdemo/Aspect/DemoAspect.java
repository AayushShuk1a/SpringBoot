package com.luv2code.springboot.thymeleafdemo.Aspect;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Aspect
@Component
public class DemoAspect {

    private Logger myLogger = Logger.getLogger(getClass().getName());

    @Pointcut("execution(* com.luv2code.springboot.thymeleafdemo.contoller.*.*(..))")
    private void forControllerPackage(){};

    @Pointcut("execution(* com.luv2code.springboot.thymeleafdemo.dao.*.*(..))")
    private void forDaoPackage(){};

    @Pointcut("execution(* com.luv2code.springboot.thymeleafdemo.service.*.*(..))")
    private void forServicePackage(){};

    @Pointcut("forControllerPackage() || forDaoPackage() || forServicePackage()")
    private void forAllDemo(){};

    @Before("forAllDemo()")
    public void forAppFlow(JoinPoint joinPoint){
        String method=joinPoint.getSignature().toShortString();
        myLogger.info("=====>> in @Before: calling method: " + method);

        Object[]args=joinPoint.getArgs();
        for(Object tempArg:args)
        {
            myLogger.info("=====>> argument: " + tempArg);
        }

    }

    @AfterReturning(pointcut = "forAllDemo()",returning = "result")
    public void forAppFlowReturn(JoinPoint joinPoint,Object result){

        // display method we are returning from
        String theMethod = joinPoint.getSignature().toShortString();
        myLogger.info("=====>> in @AfterReturning: from method: " + theMethod);

        // display data returned
        myLogger.info("=====>> result: " + result);

    }





}
