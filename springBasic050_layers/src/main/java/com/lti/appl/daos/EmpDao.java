package com.lti.appl.daos;

import java.util.ArrayList;

import com.lti.appl.entities.Employee;
import com.lti.appl.exceptions.HrExceptions;

public interface EmpDao {

	public ArrayList<Employee> getEmpList() throws HrExceptions;
}
