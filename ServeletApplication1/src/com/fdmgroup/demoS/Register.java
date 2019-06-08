package com.fdmgroup.demoS;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jdk.nashorn.internal.codegen.CompilerConstants.Call;

/**
 * Servlet implementation class Register
 */
@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Register() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String gender = request.getParameter("gender");
		String[] hobbies = request.getParameterValues("hobbies");
		String country = request.getParameter("country");
		String[] languages = request.getParameterValues("languages");
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.println(username);
		out.println(password);
		out.println(gender);
		out.println(country);
		for (int i = 0; i < languages.length; i++) {
			out.println("languages" + languages[i]);
		}
		
		for (int i = 0; i < hobbies.length; i++) {
			out.println("Hobbies" + hobbies[i]);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String gender = request.getParameter("gender");
		String[] hobbies = request.getParameterValues("hobbies");
		String country = request.getParameter("country");
		String[] languages = request.getParameterValues("languages");
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.println(username);
		out.println(password);
		out.println(gender);
		out.println(country);
		for (int i = 0; i < languages.length; i++) {
			out.println("languages" + languages[i]);
		}
		
		for (int i = 0; i < hobbies.length; i++) {
			out.println("Hobbies" + hobbies[i]);
		}
		
		//or simply Call the get method as under it as under
		//doGet(request, response);
	}

}
