package com.lti.app;

import java.util.ArrayList;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;
@Component("dao1")
public class EmpDaoImpl1 implements EmpDao {

	@Override
	@PostConstruct
	public ArrayList<String> getEmpList() {
		// TODO Auto-generated method stub
		System.out.println("hello");
		return null;
	}
	
	
	public void initAllValues(){
		System.out.println("In initallvalues");
	}

}
