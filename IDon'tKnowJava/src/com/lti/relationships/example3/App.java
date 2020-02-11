package com.lti.relationships.example3;

import java.time.LocalDate;

public class App {

	public static void main(String[] args) {
		Payroll payroll = new Payroll();
		
		Manager mgr = new Manager();
		mgr.setPsno(123456);
		mgr.setName("Dinesh");
		mgr.setSalary(10000);
		mgr.setDateOfJoining(LocalDate.of(2010, 10, 10));
		mgr.setIncentives(5000);
		
		Developer dvr = new Developer();
		dvr.setPsno(567890);
		dvr.setName("Majrul");
		dvr.setSalary(10000);
		dvr.setDateOfJoining(LocalDate.of(2010, 10, 10));
		dvr.setOvertime(24);
		
		payroll.salaryDo(mgr);
		payroll.salaryDo(dvr);
	}
}
