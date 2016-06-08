package com.github.uninxc.profiler;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import com.github.uninxc.profiler.utils.URIHelper;


public class ProfilingAspect {

	public void before(JoinPoint joinPoint){
		System.out.println(">>>>>>>>>>>>>>>>>>");

		System.out.println(URIHelper.getCurrentRequestUrl()+"-------"+System.currentTimeMillis());
	}
	
	
	public void after(JoinPoint joinPoint){
		 
		
		System.out.println("<<<<<<<<<<<<<<<<<<<");

		System.out.println(URIHelper.getCurrentRequestUrl()+"-------"+System.currentTimeMillis());

	}
	
	
	public void afterThrowing(JoinPoint joinPoint){
		
	}
	
	
}
