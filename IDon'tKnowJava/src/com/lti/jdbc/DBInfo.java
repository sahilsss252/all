package com.lti.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.Scanner;

public class DBInfo {

	public static void main(String[] args) {
		Connection conn = null;
		try {
			//Step 1. Load the JDBC Driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//Step 2. Establish Connection with the Database
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "hr";
			String pass = "hr";
			conn = DriverManager.getConnection(url, user, pass);
			
			System.out.println("yayyyyyy, got connected..");
			
			DatabaseMetaData dbms = conn.getMetaData();
			System.out.println(dbms.getDatabaseProductName());
			System.out.println(dbms.getDatabaseProductVersion());
			
			Statement stmt = conn.createStatement();
			//stmt.execute("create table temp(empno number)");
			//System.out.println("Table created..");
			
			ResultSet rs = stmt.executeQuery("select sysdate from dual");
			if(rs.next())
				System.out.println(rs.getString("sysdate"));
			
			ResultSet rs1 = stmt.executeQuery("select * from emp");
			while(rs1.next()) {
				System.out.println(rs1.getInt("empno") + " " + rs1.getString("ename"));
			}
			
			ResultSet rs2 = stmt.executeQuery("select count(*) as ct from emp");
			if(rs2.next())
				System.out.println(rs2.getInt("ct"));
			
			CallableStatement cst = conn.prepareCall("{ ? = call add_no(?,?) }");
			cst.registerOutParameter(1, Types.NUMERIC);
			cst.setInt(2, 10);
			cst.setInt(3, 20);
			cst.execute();
			System.out.println(cst.getInt(1));
			
			cst = conn.prepareCall("{ call get_emp_data(?,?,?) }");
			cst.setInt(1, 7369);
			cst.registerOutParameter(2, Types.VARCHAR);
			cst.registerOutParameter(3, Types.DOUBLE);
			cst.execute();
			System.out.println(cst.getString(2));
			System.out.println(cst.getString(3));
			
			//TODO: Understand Statement and PreparedStatement difference
			//Statement stmt1 = conn.createStatement();
			//int count = stmt1.executeUpdate("insert into dept values(50,'IT','MAHAPE')");
			//System.out.println(count + " row(s) inserted");
			
			//Now let's take input from the user and store the same in DB
			Scanner s = new Scanner(System.in);
			System.out.print("Enter Deptno : ");
			int deptno = Integer.parseInt(s.next());
			System.out.print("Enter Name : ");
			String name = s.next().toUpperCase();
			System.out.print("Enter Location : ");
			String loc = s.next().toUpperCase();
			
			//Now fire the insert query
			String sql = "insert into dept values(?,?,?)";
			PreparedStatement st = conn.prepareStatement(sql);
			st.setInt(1, deptno);
			st.setString(2, name);
			st.setString(3, loc);
			int count = st.executeUpdate();
			if(count == 1)
				System.out.println("Record inserted..");
			/*Statement st = conn.createStatement();
			String sql = "insert into dept values("+deptno+",'"+name+"','"+loc+"')";
			System.out.println(sql);
			
			int count = st.executeUpdate(sql);
			if(count == 1)
				System.out.println("Record inserted..");*/
			
			
			
			
		}
		catch(ClassNotFoundException cnfe) {
			System.out.println("Failed to load JDBC Driver. "
					+ "Check if the driver jar is in the classpath");
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			try { conn.close(); } catch(Exception e) { }
		}
	}
}
