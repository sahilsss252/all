package com.lti.login;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;



public class UserManager {

	private Map<String, String> users;
	
	public UserManager() {
		users = new HashMap<>();
		users.put("majrul", "123");
		users.put("nikhil", "456");
		users.put("dinesh", "789");
		users.put("gaurav", "000");
	}
	
	public boolean isValidUser(String username, String password) {
		if(users.containsKey(username))
			if(users.get(username).equals(password))
				return true;
		return false;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String username = s.next();
		String password = s.next();
		
		UserManager mgr = new UserManager();
		boolean isValid = mgr.isValidUser(username,password);//("majrul", "111");
		if(isValid)
			System.out.println("Congrats, you have successfully hacked into the system");
		else
			System.out.println("Invalid Username/Password");
	}
}
