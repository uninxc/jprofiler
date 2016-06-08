package com.github.uninxc.profiler.utils;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

public class URIHelper {

	private static  HttpServletRequest getHttpServletRequest(){
		RequestAttributes requestAttributes = RequestContextHolder.getRequestAttributes();
		if(null != requestAttributes && requestAttributes instanceof ServletRequestAttributes) {
		  HttpServletRequest request = ((ServletRequestAttributes)requestAttributes).getRequest();
		  return request;
		}
		
		// TODO 获取dubbo服务地址
		
		throw new UnsupportedOperationException("本系统不支持此种系统应用，目前支持dubbo服务和Web工程项目！");
	}
	
	
	public static String getCurrentRequestUrl(){
		return URIHelper.getHttpServletRequest().getRequestURL().toString();
	}
	
}
