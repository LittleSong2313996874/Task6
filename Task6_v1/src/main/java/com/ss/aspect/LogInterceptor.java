package com.ss.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class LogInterceptor {

    private final Logger logger = LoggerFactory.getLogger(LogInterceptor.class);
    private long start;
/*
    //前置通知
    public void beforeMethod() {
        start = System.currentTimeMillis();
    }
    //后置通知
    public void afterMethod() {
        long cost = System.currentTimeMillis() - start;
        logger.info("执行方法用时："+cost+" 毫秒");

    }*/

    public Object Around (ProceedingJoinPoint joinPoint)
            throws java.lang.Throwable
    {
        start = System.currentTimeMillis();


        Object obj = joinPoint.proceed(joinPoint.getArgs());
        long cost = System.currentTimeMillis() - start;
        logger.info(joinPoint.getSignature()+"   执行方法用时: "+cost+" 毫秒");

        //这里可以返回Object对象，也可以返回String，总之就是对目标方法返回的东西进行加工或不加工
        //Controller返回的是一个视图，即jsp的逻辑路径，如果这里不返回，相当于目标方法没有返回视图名称，将报错。
        //如果只是处理Controller，返回String类型即可，但是考虑到返回的类型不确定，还是使用Object比较安全
        return obj;
    }

}