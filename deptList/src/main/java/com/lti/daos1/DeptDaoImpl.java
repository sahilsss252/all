package com.lti.daos1;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.lti.dept.Department;

@Component("dao")
public class DeptDaoImpl implements DeptDao {

	@Autowired
	private DataSource ds;
	
	public ArrayList<Department> getList() {
		// TODO Auto-generated method stub
		Connection con=null;
		Statement stmt=null;
		ResultSet rs=null;
		ArrayList<Department> lst=new ArrayList<Department>();
		
		try {
			con=ds.getConnection();
			stmt=con.createStatement();
			rs=stmt.executeQuery("select deptno,dname from dept");
			while(rs.next()){
				int dno=rs.getInt(1);
				String name=rs.getString(2);
				Department department=new Department(dno, name);
				lst.add(department);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return lst;
	}

}
