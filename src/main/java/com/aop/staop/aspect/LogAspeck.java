package com.aop.staop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * @author squirrel
 * @date 2019-01-09
 */
@Aspect
@Component
public class LogAspeck {

    @Before("execution(* com.aop.staop.service.impl.AopServiceImpl.*(..))")
    public void before(JoinPoint joinPoint) {
        MethodSignature methodSignature = (MethodSignature)joinPoint.getSignature();
        Method method = methodSignature.getMethod();
        System.out.println(method.getName() + "开始记录日志....");
    }

    @After("execution(* com.aop.staop.service.impl.AopServiceImpl.*(..))")
    public void after(JoinPoint joinPoint) {
        MethodSignature methodSignature = (MethodSignature)joinPoint.getSignature();
        Method method = methodSignature.getMethod();
        System.out.println(method.getName() + "结束记录日志 !!!!!!");
    }
}
