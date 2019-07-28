package com.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {

//	@Before("execution(* com.customer.CustomerBo.*(..))")
//	public void logBefore(JoinPoint joinpoint) {
//		
//		System.out.println("logBefore() is running!");
//		System.out.println("hijacked: "+joinpoint.getSignature().getName());
//		System.out.println("******");
//	}
//	
//	@After("execution(* com.customer.CustomerBo.*(..))")
//	public void logAfter(JoinPoint joinPoint) {
//
//		System.out.println("logAfter() is running!");
//		System.out.println("hijacked : " + joinPoint.getSignature().getName());
//		System.out.println("******");
//	}
//	
//	@AfterReturning(pointcut="execution(* com.customer.CustomerBo.*(..))", returning= "result")
//	public void logAfterReturning(JoinPoint joinPoint, Object result) {
//		System.out.println("logAfterReturning() is running");
//		System.out.println("hijacked : "+ joinPoint.getSignature().getName());
//		System.out.println("Method returned value is : "+result);
//		System.out.println("*****");
//	}
	
	 @AfterThrowing(
		      pointcut = "execution(* com.customer.CustomerBo.*(..))",
		      throwing= "error")
		    public void logAfterThrowing(JoinPoint joinPoint, Throwable error) {

			System.out.println("logAfterThrowing() is running!");
			System.out.println("logAfterThrowing() is running!");
			System.out.println("hijacked : " + joinPoint.getSignature().getName());
			System.out.println("Exception : " + error);
			System.out.println("******");

		    }
	
}
