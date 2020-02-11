package com.lti.appl.daos;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.lti.appl.entities.Employee;
import com.lti.appl.exceptions.HrExceptions;
/*
 * @Component: it has four interfaces
 * 			->@Repository It represents Dao classes
	 		->@Service It reprents Service classes
 	 		->@Controller It represents controller classes of Spring MVC
	 		->@RestController It represents REST layer of Web Service
	
 * 
 * 
 * 
 * 
 * 
 */
@Repository("empDao")
public class EmpDaoImpl implements EmpDao {

	@Override
	public ArrayList<Employee> getEmpList() throws HrExceptions {
		// TODO Auto-generated method stub
		System.out.println("In getEmpList() of Dao");
		return null;
	}

}
