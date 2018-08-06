package com.training.aop.banking;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class LoggingAspectAround {
	@Around("execution(public * get*())")
	public Object sampleMyAroundAdvise(ProceedingJoinPoint proccedingJoinPoint) {
		//the advise should have compulsory argument
		Object retVal = null;
		
		try {
			System.out.println("Before job goes here..");
			retVal= proccedingJoinPoint.proceed();
			System.out.println("After Job goes here");
			
		}catch(Throwable e){
			e.printStackTrace();
		}
		return retVal;	
	}

}
