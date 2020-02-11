package com.lti.app;

import java.util.ArrayList;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


/*
 * 
 *If baen id is not mentioned ,picks up class name converts it to case and uses as id
 *By default,the bean is singleton.Use Scope to declare it as 'prototype' by using this we can create multiple objects.
 * Scope(prototype) : create a bean as many time as you demand
 *  Scope(singleton) : create a bean only once. it is default.
 *    
 */
@Component("dao")
@Scope("prototype")
public class EmpDaoImpl implements EmpDao  {

	public EmpDaoImpl(){
		 System.out.println("Object EmpDaoImpl() created.");
	}

	public ArrayList<String> getEmpList() {
		// TODO Auto-generated method stub
		ArrayList<String> lst=new ArrayList<>();
		lst.add("chinamy");
		lst.add("sahil");
		lst.add("grishma");
		lst.add("akanksha");
		
		
		
		
		return lst;
	}
}
