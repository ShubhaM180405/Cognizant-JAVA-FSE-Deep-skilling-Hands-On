package com.shubham.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {

    @Before("execution(* com.shubham.service.*.*(..))")
    public void logBeforeMethod(JoinPoint joinPoint) {

        System.out.println(">> Entering the method : " + joinPoint.getSignature().getName());

    }

}