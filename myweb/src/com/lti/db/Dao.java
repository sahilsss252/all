package com.lti.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.lti.model.RegisterM;

public class Dao {
	static Connection conn;
	ResultSet rs;
	
	public static void main() throws ClassNotFoundException {
		
		try	{
			Class.forName("oracle.jdbc.driver.OracleDriver");
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "hr";
		String pass = "hr";
		conn = DriverManager.getConnection(url, user, pass);
	
		}catch(SQLException e){
			System.out.println(e.getStackTrace());
		}
	}
//	public boolean insert(RegisterM rm){
//		
//		Connection conn = null;
//		 PreparedStatement stmt;
//		 ResultSet rs;
//		 try	{
//				Class.forName("oracle.jdbc.driver.OracleDriver");
//				
//				String url = "jdbc:oracle:thin:@localhost:1521:xe";
//				String user = "hr";
//				String pass = "hr";
//				conn = DriverManager.getConnection(url, user, pass);
//				
//				stmt=conn.prepareStatement("insert into register values(?,?,?,?)");
//				stmt.setString(1, name);
//				stmt.setString(2, email);
//				stmt.setString(3, City);
//				stmt.setString(4, pass);
//				stmt.executeUpdate();
//				return true;
//						
//				}
//				catch(Exception e){
//					
//					return false;
//				}
//				
//	}
}
