package com.fdmgroup.howtoshowrequestheader;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ContentTypeDemo
 */
@WebServlet("/ContentTypeDemo")
public class ContentTypeDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ContentTypeDemo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		//response.setContentType("application/vnd.ms-excel"); -- will open MS Excel!
//		printWriter.println("outputted!");
//		printWriter.println("Rno\tName\tMaths\tChem");
//		printWriter.println("101\tName\t15\t56");
		
		PrintWriter printWriter = response.getWriter();
		
		response.setIntHeader("Refresh", 1);
		
		//Date currentDate = new Date();
		
		java.util.Date date = new java.util.Date();
		
		SimpleDateFormat formateDate = new SimpleDateFormat("E dd-M-yy 'at' hh:mm:ss");
		
		String dateF = formateDate.format(date);
		
		printWriter.println(dateF);
		
		
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
