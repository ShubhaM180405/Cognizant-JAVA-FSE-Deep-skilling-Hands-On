package com.shubham.aspect;

import org.aspectj.lang.JoinPoint;

public class LoggingAspect {

    public void logBeforeMethod(JoinPoint joinPoint) {

        System.out.println("[LOG] Before executing : "
                + joinPoint.getSignature().getName());

    }

    public void logAfterMethod(JoinPoint joinPoint) {

        System.out.println("[LOG] After executing : "
                + joinPoint.getSignature().getName());

    }

}