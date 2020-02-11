package com.lti.appl.services;

import java.util.ArrayList;

import com.lti.appl.entities.Employee;
import com.lti.appl.exceptions.HrExceptions;

public interface EmpServices {
	public ArrayList<Employee> getEmpList() throws HrExceptions;
}
