package com.fdmgroup.howtoshowrequestheader;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.text.html.HTML;

/**
 * Servlet implementation class ShowRequestHeader
 */
@WebServlet("/ShowRequestHeader")
public class ShowRequestHeader extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ShowRequestHeader() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at:
		// ").append(request.getContextPath());

		/*
		 * 
		 * reading HTTP headers - when the client sent request then HTTP request
		 * headers passed to webserver
		 * 
		 * getHeader(String name): null if the no header is provided or first
		 * header getHeaderNames(): all header names as enumeration
		 * getAuthType(): getRemoteUser(): name of user making request
		 * getRemoteAddr(): last proxy or ip address of client getContentType():
		 */
		response.setContentType("text/html");
		PrintWriter printWriter = response.getWriter();

		printWriter.println("<p> Content Lenght: " + request.getContentLength());
		printWriter.println("<p>remote Address" + request.getRemoteAddr());
		printWriter.println("<p> new tab:");
		printWriter.println("<p> Request Method: " + request.getMethod());
		printWriter.println("<p> Request URI: " + request.getRequestURI());
		printWriter.println("<p> Request protocol : " + request.getProtocol());
		// request.getHeader(getServletInfo());

		Enumeration<String> headerNames = request.getHeaderNames();

		while (headerNames.hasMoreElements()) {
			String string = (String) headerNames.nextElement();
			printWriter.print("<p>" + string + "   -> " + request.getHeader(string));

		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
