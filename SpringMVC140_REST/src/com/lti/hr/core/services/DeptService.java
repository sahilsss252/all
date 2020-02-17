package com.lti.hr.core.services;

import java.util.ArrayList;

import com.lti.hr.core.entities.Department;
import com.lti.hr.core.exception.HrException;

public interface DeptService {

	public ArrayList<Department> getDeptList() throws HrException;
	public boolean createNewDept(Department d) throws HrException;
	public Department fetchDeptList(int d) throws com.lti.hr.core.exception.HrException;
}
