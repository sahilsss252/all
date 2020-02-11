package com.lti.first;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Base64;
import java.util.Base64.Encoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lti.login.UserManager;


@WebServlet("/Login.lti")
public class Login extends HttpServlet {

   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Base64.Encoder encoder=Base64.getEncoder();
		String nm=request.getParameter("user");
		String pass=request.getParameter("pass");
		
		byte[] arr1=nm.getBytes();
		byte[] arr2=pass.getBytes();
		
		String u_name=encoder.encodeToString(arr1);
		String u_pass=encoder.encodeToString(arr2);
		
		
		PrintWriter out=response.getWriter();
		
		System.out.println(nm);
		UserManager u=new UserManager();
		boolean b=u.isValidUser(nm, pass);
		if(b){
			
			String checkme=request.getParameter("remember");
			if(checkme.equals("yes") && checkme != null);
			{
			    
				Cookie c1=new Cookie("uname",u_name);
				c1.setMaxAge(60*60);
				Cookie c2=new Cookie("pass",u_pass);
				c1.setMaxAge(60*60);
				response.addCookie(c1);
				response.addCookie(c2);
			}
			
			response.sendRedirect("welcome.html");
		}
		else
		{
			response.sendRedirect("login.html");
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
