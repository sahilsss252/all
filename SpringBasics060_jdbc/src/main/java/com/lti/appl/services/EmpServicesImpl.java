package com.lti.appl.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.appl.daos.EmpDao;
import com.lti.appl.entities.Employee;
import com.lti.appl.exceptions.HrExceptions;

@Service("empService")
public class EmpServicesImpl implements EmpServices {

	@Autowired 
	private EmpDao dao;

	public ArrayList<Employee> getEmpList() throws HrExceptions {
		// TODO Auto-generated method stub
		return dao.getEmpList();
	}
	public Employee getempDetails(){
		return  dao.fetchEmployee(786);
	}
	public void joinEmp(Employee e) {
		dao.insertEmployee(e);
		
	}

	
	
}
