package com.lti.relationships.example4.v1;

import java.net.Inet4Address;
import java.time.LocalDateTime;

/**
 * 
 * A simple logger implementation
 * 
 * @author Majrul Ansari
 * @version 1.0
 *
 */
public class Logger {

	public void log(String msg) {
		//System.out.println("[INFO] [" + LocalDateTime.now()+"] "+msg);
		log(msg, LogLevel.INFO);
	}
	
	public void log(String msg, LogLevel level) {
		String ip = "127.0.0.1";
		try {
			ip = Inet4Address.getLocalHost().getHostAddress();
		}
		catch(Exception e) {
			//we will ignore the catch for now
		}
		
		switch(level) {
		case INFO:
			System.out.println("[INFO] [" + ip +"] [" + LocalDateTime.now()+"] "+msg);
			break;
		case WARN:
			System.out.println("[WARNING] [" + ip +"] [" + LocalDateTime.now()+"] "+msg);
			break;
		case ERROR:
			System.out.println("[ERROR] [" + ip +"] [" + LocalDateTime.now()+"] "+msg);
			break;
		
		}
	}
	
}
