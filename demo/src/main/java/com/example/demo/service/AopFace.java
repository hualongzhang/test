package com.example.demo.service;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;
/**
 * @author zhanghualong
 * spring aop切面
 *
 */
@EnableAspectJAutoProxy
@Component
@Aspect
public class AopFace {
	
	@Pointcut("execution (* com.example.demo.service.TestInterface.test(..))")
    private void anyMethod() {} // 声明一个切入点，anyMethod为切入点名称

    // 声明该方法是一个前置通知：在目标方法开始之前执行 
    @Before("anyMethod()")
    public void doAccessCheck() {
        System.out.println("前置通知");
    }

}
