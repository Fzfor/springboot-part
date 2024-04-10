package com.atguigu.advice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @ClassName: MyAdvice
 * @Author: bin.zhao
 * @Description:
 * @Date: Created in 09:05 2024/04/09
 * @Modified By: bin.zhao
 * @Modify Time: 09:05 2024/04/09
 * @Version: 1.0
 */
@Component
@Aspect
@Order(5)
public class MyAdvice {

    @Before("execution(* com..service.*.*(..))")
    public void before(JoinPoint joinPoint){
        String className = joinPoint.getTarget().getClass().getName();
        String methodName = joinPoint.getSignature().getName();
        System.out.println(className + " :: " + methodName + "开始执行了！");
    }
}
