package com.DemoAop.AOP.Demo.Aspect;


import com.DemoAop.AOP.Demo.dao.Account;
import com.DemoAop.AOP.Demo.dao.AccountDao;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.List;

@Aspect
@Component
@Order(1)
public class MyDemoLogginAspect {


    @AfterThrowing(pointcut = "execution(* com.DemoAop.AOP.Demo.dao.AccountDao.findAccount(..))",throwing = "theExec")
    public void AfterThrowingDemo(JoinPoint joinPoint,Throwable theExec){
        System.out.println(getClass()+" "+theExec);
    }

    @Before("com.DemoAop.AOP.Demo.Aspect.AopExpression.DaoPackageWithNoGetterSetter()")
    public void beforeAddAccount(JoinPoint joinPoint){
        System.out.println("execution @Before addaccount from MyDemoLogginAspect");

        MethodSignature methodSignature=(MethodSignature) joinPoint.getSignature();
        System.out.println("Method : "+methodSignature);

        Object[]args=joinPoint.getArgs();

        for(Object tempArg:args){
            System.out.println("tempArg :"+tempArg);

            if(tempArg instanceof Account){
                Account account=(Account) tempArg;
                System.out.println("Name : "+account.getName());
                System.out.println("Age : "+account.getAge());
            }
        }
    }

    @AfterReturning(pointcut = "execution(* com.DemoAop.AOP.Demo.dao.AccountDao.findAccount(..))",returning = "result")
    public void afterReturnAccount(JoinPoint joinPoint, List<Account>result){
        MethodSignature methodSignature=(MethodSignature) joinPoint.getSignature();
        System.out.println("Method : "+methodSignature+" "+getClass());

        System.out.println("results : "+result);

        for(Account i:result){
            String UpperName=i.getName().toUpperCase();
            i.setName(UpperName);
        }

        System.out.println("After Result: "+result);

    }


}
