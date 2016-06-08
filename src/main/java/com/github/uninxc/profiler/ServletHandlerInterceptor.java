package com.github.uninxc.profiler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;

/**
 * 用于支持普通Servlet框架
 */
public interface ServletHandlerInterceptor {
	
	boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
		    throws Exception;
	
	
	void postHandle(
			HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView)
			throws Exception;
	
	void afterCompletion(
			HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception;
}
