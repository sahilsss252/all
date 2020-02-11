package com.lti.appl.daos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lti.appl.entities.Employee;
import com.lti.appl.exceptions.HrExceptions;
/*
 * @Component: it has four interfaces
 * 			->@Repository It represents Dao classes
	 		->@Service It reprents Service classes
 	 		->@Controller It represents controller classes of Spring MVC
	 		->@RestController It represents REST layer of Web Service
	
 * 			the SQLException must not come out of DAO. Instead ,let custom exception come.
 * 			The custom Exception must be chained with SQLException to pass-on complete stack trace to client side
 * 			No method of DAO to return resultset. Instead return Collection of objects. 
 * 			Always close resources in exactly opposite order of opened them.
 * 			Always close resources in finalized method.
 * 			The close() of connection if obtained from data source, does not close() connection
 * 			but returns back to the Data Source.  
 */
//@Repository("empDao")
public class EmpDaoImpl implements EmpDao {

	@Autowired
	private DataSource ds;
	
	public ArrayList<Employee> getEmpList() throws HrExceptions {
		// TODO Auto-generated method stub
		Connection conn=null;
		Statement stmt=null;
		ResultSet rs=null;
		ArrayList<Employee> lst=new ArrayList<Employee>();
		try{
		conn=ds.getConnection();
		stmt=conn.createStatement();
		rs=stmt.executeQuery("select empno,ename,sal,deptno from emp");
		while(rs.next()){
			int empno=rs.getInt(1);
			String ename=rs.getString(2);
				float esal=rs.getFloat(3);
				int d=rs.getInt(4);
				Employee e=new Employee(empno,ename,esal,d);
				lst.add(e);
		}
		}
		catch(SQLException e){
			//e.printStackTrace();
			throw new HrExceptions("Exception in method getEmpList() from dao"+e);
		}
		finally{
			try {
				if(rs!=null)
				rs.close();
				if(stmt!=null)
					stmt.close();
				if(conn!=null)
					conn.close();
			} catch (SQLException e) {
				throw new HrExceptions("Exception in method close() from dao"+e);
			}
			
		}
		return lst ;
	}

	public Employee fetchEmployee(int empno) {
		// TODO Auto-generated method stub
		return null;
	}

	public void insertEmployee(Employee e) {
		// TODO Auto-generated method stub
		
	}

	

}
