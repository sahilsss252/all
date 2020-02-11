package com.lti.app;

import java.time.LocalDate;
import java.util.List;

import com.lti.edao.EmployeeDao;
import com.lti.entity.Customer;
import com.lti.entity.Employee;

public class App {
public static void main(String[] args) {
//	Employee e=new Employee();
//	e.setName("Sahil");
//	e.setDateOfJoining(LocalDate.of(2020, 1, 11));
//	e.setSalary(11000);
	EmployeeDao ed=new EmployeeDao();
//	ed.add(e);
//	Employee e1=new Employee();
//	e1.setName("Chinmay");
//	e1.setDateOfJoining(LocalDate.of(2020, 11, 1));
//	e1.setSalary(15000);
//	//EmployeeDao ed=new EmployeeDao();
//	ed.add(e1);
//	Employee e2=new Employee();
//	e2.setName("Grishma");
//	e2.setDateOfJoining(LocalDate.of(2020, 12, 1));
//	e2.setSalary(200000);
//	//EmployeeDao ed=new EmployeeDao();
//	ed.add(e2);
//	Employee e3=new Employee();
//	e3.setName("Akanksha");
//	e3.setDateOfJoining(LocalDate.of(2020, 1, 12));
//	e3.setSalary(30000);
//	//EmployeeDao ed=new EmployeeDao();
//	ed.add(e3);
//	Employee e5=ed.fetch(1);
//	Customer c=new Customer();
//	c.setName("abc");
//	c.setMobile(12435679);
//	ed.add(c);
//	List<Employee> lst1 =ed.fetchByyear(2020);
//	for(Employee emp:lst1){
//		System.out.println(emp.getPsno());
//		System.out.println(emp.getName());
//		System.out.println(emp.getDateOfJoining());
//		System.out.println(emp.getSalary());
//	}
	List<Employee> lst3 =ed.fetchBymonth(01);
	for(Employee emp:lst3){
		System.out.println(emp.getPsno());
		System.out.println(emp.getName());
		System.out.println(emp.getDateOfJoining());
		System.out.println(emp.getSalary());
	}
//	List<Employee> lst =ed.fetchBySalary(15000);
//	for(Employee emp:lst){
//		System.out.println(emp.getPsno());
//		System.out.println(emp.getName());
//		System.out.println(emp.getDateOfJoining());
//		System.out.println(emp.getSalary());
//   }
	Customer c1=new Customer();
	
}
}
