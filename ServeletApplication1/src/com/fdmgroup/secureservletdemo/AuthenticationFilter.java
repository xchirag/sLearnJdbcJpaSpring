package com.fdmgroup.secureservletdemo;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

import org.apache.jasper.tagplugins.jstl.core.Out;

/**
 * Servlet Filter implementation class AuthenticationFilter
 */
@WebFilter("/AuthenticationFilter")
public class AuthenticationFilter implements Filter {

	/**
	 * Default constructor.
	 */
	public AuthenticationFilter() {
		// TODO Auto-generated constructor stub
	}

	public void destroy() {
		System.out.println("destroy method is called : " + this.getClass().getName());
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("doFileter method is called : " + this.getClass().getName());
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String ipAdd = request.getRemoteAddr();

		if (username.equals("user1") && password.equals("password1")) {
			System.out.println("user logged from " + ipAdd + "at " + new Date().toString());
			
		} else {
			PrintWriter out = response.getWriter();
			out.println("you are not authorised");
		}

	}

	public void init(FilterConfig fConfig) throws ServletException {

		System.out.println("init Method is called in: " + this.getClass().getName());
	}

}
