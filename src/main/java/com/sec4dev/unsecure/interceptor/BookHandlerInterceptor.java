package com.sec4dev.unsecure.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

@Component
public class BookHandlerInterceptor implements HandlerInterceptor {
	
	//Before the actual handler is executed and the view is not generated
	//@Overrhide
	public boolean preHandle(	HttpServletRequest request, 
								HttpServletResponse response, 
								Object handler) throws Exception {
		if(request.getParameter("bookid") != null) {
			System.out.println("The preHandle() method says: Book "+ request.getParameter("bookid")+ " accessed.");
		}
		return true;
	}
	
	
	//After the handler is executed and before view is rendered
	//@Overrhide
	public void postHandle(		HttpServletRequest request, 
								HttpServletResponse response, 
								Object handler, ModelAndView modelAndView) throws Exception {
		if(request.getParameter("bookid") != null) {
			System.out.println("The postHandle() method says: Book "
								+ request.getParameter("bookid")
								+ " access complete.");
		}
	}
	
	//After the handler is executed, request is complete, and the view is rendered
	public void afterCompletion(HttpServletRequest request, 
								HttpServletResponse response, 
								Object handler, Exception ex) throws Exception {
		if(request.getParameter("bookid") != null) {
			System.out.println("After handling of Book " 
								+ request.getParameter("bookid") 
								+ ". Request and Response complete.");
		}
	}
}
