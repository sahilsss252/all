package com.lti.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserService {

	private List<User> users;
	
	public UserService() {
		users = new ArrayList<User>();
		users.add(new User("majrul", "123", false));
		users.add(new User("nikhil", "456", true));
		users.add(new User("dinesh", "789", true));	
		users.add(new User("gaurav", "000", false));	
	}
	
	public boolean isValidUser(String username, String password) {
		for(User user : users)
			if(user.getUsername().equals(username))
				if(user.getPassword().equals(password))
					if(user.isAllowed())
						return true;
		return false;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String username = s.next();
		String password = s.next();
		
		UserService mgr = new UserService();
		boolean isValid = mgr.isValidUser(username,password);//("majrul", "111");
		if(isValid)
			System.out.println("Congrats, you have successfully hacked into the system");
		else
			System.out.println("Invalid Username/Password");
	}
}
