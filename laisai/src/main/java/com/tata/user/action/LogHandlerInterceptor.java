package com.tata.user.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class LogHandlerInterceptor implements HandlerInterceptor{
	/**
	 * 在Action之前执行，判断是否往下执行
	 * 如果返回true则可以往下执行，如果返回false则终止执行
	 */
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		long startTime = System.currentTimeMillis();
		//System.out.println("startTime:" + startTime);
		request.setAttribute("startTime", startTime);
		return true;
	}

	/**
	 * 在Action执行后，渲染view之前执行
	 */
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		//System.out.println("handler" + handler.getClass().getName());
		long endTime = System.currentTimeMillis();
		long startTime = (Long)request.getAttribute("startTime");
		System.out.println("总耗时：" + (endTime - startTime));
	}

	/**
	 * 渲染view之后执行，一般用于清理资源
	 */
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		
	}
	
}
