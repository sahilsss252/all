package com.lti.hr.core.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.lti.hr.core.daos.DepartmentDao;
import com.lti.hr.core.daos.*;
import com.lti.hr.core.entities.Department;
import com.lti.hr.core.exception.*;

@Service//contains all annotation of spring only
public class DeptServiceImpl implements DeptService {
	
	@Autowired
	private DepartmentDao dao;
	
	@Override
	public ArrayList<Department> getDeptList() throws HrException  {
		return dao.getDeptList();
	}
	
	@Transactional(propagation=Propagation.REQUIRES_NEW)//creats a new transaction
	@Override
	public boolean createNewDept(Department d) throws HrException {
		//Department department=new Department();
		//transaction must be start in service layer and managed by dao layer
		return dao.insertDept(d);
	}
	
	
	@Override
	public Department fetchDeptList(int d) throws HrException {
		// TODO Auto-generated method stub
		return dao.fetchDeptList(d);
	}

}
