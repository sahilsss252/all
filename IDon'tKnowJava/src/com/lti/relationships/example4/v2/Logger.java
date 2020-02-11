package com.lti.relationships.example4.v2;

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
		
	}
	
}
