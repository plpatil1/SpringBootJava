package com.app;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;
import java.io.IOException;

public class MyFilter extends HttpFilter implements Filter {

    public MyFilter() {
        super();
       System.out.println("Filter Constructor invoked");
       
    }

	public void destroy() {
		System.out.println("Filter Destroyed");
	}

	public void doFilter(ServletRequest request, ServletResponse response, 
			FilterChain chain) throws IOException, ServletException {
		System.out.println("Filter Invoked Before");
		String pwd = request.getParameter("txtPassword");
		pwd = pwd.trim().toUpperCase();
		request.setAttribute("password", pwd);
		// pass the request along the filter chain
		chain.doFilter(request, response);
		System.out.println("Filter Invoked After");
		
	}

	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("In init() of filter");
	}

}
