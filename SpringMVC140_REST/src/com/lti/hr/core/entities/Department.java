package com.lti.hr.core.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="dept1")
public class Department {
	
	@Id
	@Column(name="deptno")
	private int deptNo;
	
	@Column(name="dname")
	private String deptNm;
	
	@Column(name="LOC")
	private String deptLoc;
	
	public Department() {
		// TODO Auto-generated constructor stub
	}

	
	public Department(int deptNo, String deptNm, String deptLoc) {
		super();
		this.deptNo = deptNo;
		this.deptNm = deptNm;
		this.deptLoc = deptLoc;
	}

	public int getDeptNo() {
		return deptNo;
	}

	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}

	public String getDeptNm() {
		return deptNm;
	}

	public void setDeptNm(String deptNm) {
		this.deptNm = deptNm;
	}

	public String getDeptLoc() {
		return deptLoc;
	}

	public void setDeptLoc(String deptLoc) {
		this.deptLoc = deptLoc;
	}
	
	@Override
	public String toString() {
		return "Department [deptNo=" + deptNo + ", deptNm=" + deptNm + ", deptLoc=" + deptLoc + "]";
	}


}
