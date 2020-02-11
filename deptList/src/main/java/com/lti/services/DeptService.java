package com.lti.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;

import com.lti.daos1.DeptDao;
import com.lti.dept.Department;

public interface DeptService {

	public ArrayList<Department> getDeptList();
}
