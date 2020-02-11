package com.lti.first;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lti.db.DB;
import com.lti.db.Dao;
import com.lti.model.RegisterM;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RegisterM rm = new RegisterM();
		String nm=request.getParameter("name");
		String email=request.getParameter("email");
		String pass1=request.getParameter("pass");
		String city=request.getParameter("city");
	
//		Dao d=new Dao();
//		boolean b=d.insert(nm, email, city, pass1);
//		if(b)
//		{
//			response.sendRedirect("confirmation.html");
//		}
//		else
//			
//		{
//			
//			response.sendRedirect("Register.html");
//			
//		}
		
		
		//RegisterM rm=new RegisterM();
		rm.setName(nm);
		rm.setEmail(email);
		rm.setPassword(pass1);
		rm.setCity(city);
		DB d=new DB();
		try {
			boolean b;
			try {
				b = d.add(rm);
				if(b){
					response.sendRedirect("confirmation.html");
				}
				else
				{
				
					response.sendRedirect("Register.html");
					
				}
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (SQLException e) {
		// TODO Auto-generated catch block
			e.printStackTrace();
	}
		
				
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
