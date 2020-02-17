package com.lti.hr.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lti.hr.core.entities.Department;
import com.lti.hr.core.exception.HrException;
import com.lti.hr.core.services.DeptService;

//http://localhost:8020/SpringMVC140_REST/deptList
@RestController
public class HrRsController {
	
	@Autowired
	private DeptService deptService;
	
	@GetMapping(value="/deptList",produces="Application/JSON ")
	public @ResponseBody List<Department> getDeptList() throws HrException{
		 
		ArrayList<Department> deptList= deptService.getDeptList();
		return deptList;
	}
	
	@PostMapping(value="/addDept",consumes="Application/JSON ")
	public void getDeptList(@RequestBody Department dept) throws HrException{
		
		boolean recInserted = deptService.createNewDept(dept);
		System.out.println(recInserted); 
	}
	
	@PutMapping(value="/fetchDept",consumes="Application/JSON ")
	public @ResponseBody Department fecthDeptList(@RequestBody int deptno) throws HrException{
		
		Department d = deptService.fetchDeptList(deptno);
		return d;
	
	}
	
}
