package com.tata.user.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class AuthHandlerInterceptor implements HandlerInterceptor{
	private List<String> allowURIs;
	public void setAllowURIs(List<String> allowURIs) {
		this.allowURIs = allowURIs;
	}
	
	/**
	 * 判断是否为不需要拦截的URI
	 * @return
	 */
	private boolean isAllowURI(String uri){
		if(allowURIs != null){
			for(String str: allowURIs){
				if(uri.indexOf(str) != -1){
					return true;
				}
			}
		}
		return false;
	}
	
	/**
	 * 在Action之前执行，判断是否往下执行
	 * 如果返回true则可以往下执行
	 */
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		//System.out.println("AuthHandlerInterceptor preHandler");
		HttpServletRequest httpReq = (HttpServletRequest)request;
		HttpServletResponse httpRes = (HttpServletResponse)response;
		if(httpReq.getSession().getAttribute("user") != null){
			//System.out.println("已经登录！");
			return true;
		}else{
			System.out.println("还没有登录！");
			String uri = httpReq.getRequestURI();
			if(isAllowURI(uri) == true){
				return true;
			}else{
				httpRes.sendRedirect(httpReq.getContextPath() + "/user/login.action");
				return false;
			}
		}
	}


	/**
	 * 在Action执行后，渲染view之前执行
	 */
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		
	}

}
