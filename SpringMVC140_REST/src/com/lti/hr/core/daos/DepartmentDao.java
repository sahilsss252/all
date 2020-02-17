package com.lti.hr.core.daos;

import java.util.ArrayList;

import com.lti.hr.core.entities.Department;


public interface DepartmentDao {
	public ArrayList<Department> getDeptList() throws com.lti.hr.core.exception.HrException;
	public boolean insertDept(Department d) throws com.lti.hr.core.exception.HrException;
	public Department fetchDeptList(int d) throws com.lti.hr.core.exception.HrException;
}
