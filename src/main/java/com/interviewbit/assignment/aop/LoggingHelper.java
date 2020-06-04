package com.interviewbit.assignment.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;


@Aspect
@EnableAspectJAutoProxy
@Component
public class LoggingHelper {

    private Logger logger = LoggerFactory.getLogger(LoggingHelper.class);

    @Before("execution(public String com.interviewbit.assignment.controller.HomeController.index())")
    public void before() {
        logger.info("Hello");
    }

    @After("execution(public String com.interviewbit.assignment.controller.HomeController.index())")
    public void after() {
        logger.info("Bye");
    }

}
