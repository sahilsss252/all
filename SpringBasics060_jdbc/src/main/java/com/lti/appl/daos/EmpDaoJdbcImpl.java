package com.lti.appl.daos;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;


import javax.swing.tree.TreePath;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.lti.appl.entities.Employee;
import com.lti.appl.exceptions.HrExceptions;

@Repository
public class EmpDaoJdbcImpl implements EmpDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public ArrayList<Employee> getEmpList() throws HrExceptions {
		String query="select empno,ename,sal,deptno from emp";
		List<Map<String,Object>> list=jdbcTemplate.queryForList(query, new Object[]{});
		ArrayList<Employee> lst=new ArrayList<Employee>();
		//System.out.println("\nEMPNO\tENAME\tSalary\n");
		for(Map<String,Object> i: list){
//			System.out.println(i.get("empno")+"  | "+i.get("ename")+"    | "+i.get("sal"));
			
			int empno=((BigDecimal) i.get("empno")).intValue();
			String ename=(String) i.get("ename");
			float sal=((BigDecimal) i.get("sal")).floatValue();
			int d=((BigDecimal) i.get("deptno")).intValue();
			Employee e=new Employee(empno, ename, sal,d);
			lst.add(e);
			}
		
		return lst;
	}

	public Employee fetchEmployee(int empno) {
		
		String query="select ename,empno,sal,deptno from emp where empno=?";
//		String ename=jdbcTemplate.queryForObject(query, new Object[] {empno},String.class);
//		System.out.println(ename);
		RowMapper mapper=new RowMapper<Employee>() {
			public Employee mapRow(ResultSet rs,int r) throws SQLException{
				int empno1=rs.getInt("empno");
				String ename=rs.getString("ename");
				float sal= rs.getFloat("sal");
				int d=rs.getInt("deptno");
				Employee e=new Employee(empno1, ename, sal,d);
				return e;
			}

		
			
			
		};
		Employee emp=(Employee)jdbcTemplate.queryForObject(query, mapper,empno);
		return emp;
	}

	public void insertEmployee(Employee e) {
		String query="insert into emp (Empno,ename,sal,deptno)values(?,?,?,?)";
		jdbcTemplate.update(query, new Object[] {e.getEmpno(),e.getName(),e.getEsal(),e.getDeptno()});
		
		
		
	}

}
