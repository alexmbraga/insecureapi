package com.sec4dev.unsecure.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.sec4dev.unsecure.interceptor.BookHandlerInterceptor;

@Component
public class WebAppConfiguration implements WebMvcConfigurer {
	
	@Autowired
	private BookHandlerInterceptor bookInterceptor;
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(bookInterceptor);
	}
}
