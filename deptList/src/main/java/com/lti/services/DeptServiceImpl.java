package com.lti.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.lti.daos1.DeptDao;
import com.lti.dept.Department;

@Component("service")
public class DeptServiceImpl implements DeptService{

	@Autowired
	private DeptDao dao;

	public ArrayList<Department> getDeptList() {
		// TODO Auto-generated method stub
		return dao.getList();
	}

	
}
