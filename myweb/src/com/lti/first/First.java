package com.lti.first;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class First
 */
@WebServlet("/hello.php")
public class First extends HttpServlet {
       
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		out.println("<html><body>"); 
		out.println("<h2>Hello World</h2>");
		 out.println("<h2>Hello LTI</h2>");
		 out.println("<h2>Hello............Welcome</h2>");
		 out.println("<h1>Today's date: "+LocalDate.now()+"</h1>");
		 out.println("</body></html>"); 
	}

		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
