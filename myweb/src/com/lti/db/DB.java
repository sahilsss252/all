package com.lti.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.lti.model.RegisterM;

public class DB extends Dao {
	

		
		
			 			
		public boolean add(RegisterM rm)  throws SQLException, ClassNotFoundException{
		Dao d =new Dao();
		d.main();
		
			PreparedStatement stmt = conn.prepareStatement("insert into register values(?,?,?,?)");
		
			stmt.setString(1, rm.getName());
			stmt.setString(2, rm.getEmail());
			stmt.setString(3, rm.getCity());
			stmt.setString(4, rm.getPassword());
			int val=stmt.executeUpdate();
			if(val==1)
			return  true;
			else
				return false;
			
		}

		public ResultSet check(String city) throws SQLException, ClassNotFoundException {
			
			Dao d1 =new Dao();
			d1.main();
			// TODO Auto-generated method stub
	
			PreparedStatement stmt= conn.prepareStatement("select name from register from city=?");
			//ResultSet rs=stmt.executeQuery("select * from register");
			stmt.setString(1, city);
			rs=stmt.executeQuery();
			while(rs.next())
			{
				
				System.out.println(rs.getString(1));
			}
			
			return rs;
		}

		public List<String> check1(String city) throws SQLException, ClassNotFoundException {
			// TODO Auto-generated method stub
			
			Dao d1 =new Dao();
			d1.main();
			List<String> lst=new ArrayList<>();
			
			PreparedStatement stmt= conn.prepareStatement("select * from register where city='Pune'");
			//ResultSet rs=stmt.executeQuery("select * from register");
			//stmt.setString(1, city);
			ResultSet st=stmt.executeQuery();
			//System.out.println(st.getString(1));
			while(st.next())
			{
				System.out.println(st.getString(1));
				lst.add(st.getString(1));
			}
			return lst;
		}
		
	
}
