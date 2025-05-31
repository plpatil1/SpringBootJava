package com.app.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {
	
	@Before("execution(* com.app.dao.AccountDAO.*())")
	public void beforeAdvice()
	{
		System.out.println("Before Advice Called");
	}

}
