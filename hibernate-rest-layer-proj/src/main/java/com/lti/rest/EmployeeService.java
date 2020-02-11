package com.lti.rest;

import java.io.FileReader;
import java.text.ParseException;
import java.time.LocalDate;

import javax.persistence.Access;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor;
import com.fasterxml.jackson.databind.util.JSONPObject;
import com.lti.edao.EmployeeDao;
import com.lti.entity.Employee;

import antlr.Parser;

@Path("/emp")
public class EmployeeService {

	@POST
	

	public void add(String data,@Context HttpServletResponse response )throws JsonParseException,ParseException, org.json.simple.parser.ParseException{
		response.setHeader("Access-Control-Allow-Origin","http://localhost:4200");
		// response.setHeader("Access-Control-Allow-Methods", "GET, POST, OPTIONS, PUT, PATCH, DELETE");
		//response.getLocale();
		//System.out.println(data.indexOf(e.getName()));
	//	JSONObject jsonObject = new JsonObjectFormatVisitor(data);
		//System.out.println(data.getValue());
		System.out.println(data);
		  /*JSONParser  json=new JSONParser(); 
		  Object obj=json.parse(data);
		  JSONObject jo=(JSONObject) obj;
		  Employee e=new Employee();
		  e.setName(jo.get("name").toString());
		  e.setSalary(Double.parseDouble(jo.get("sal").toString()));
		  e.setDateOfJoining(LocalDate.parse((String)jo.get("doj")));
		  System.out.println(e.getName()+" "+e.getSalary()+" "+e.getDateOfJoining());
		  EmployeeDao ed=new EmployeeDao();
		  ed.add(e);*/
		  
		  
	}
	
	
}
