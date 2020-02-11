package com.lti.relationships.example4.v3;

import java.net.Inet4Address;
import java.time.LocalDateTime;

/**
 * 
 * A simple logger implementation
 * 
 * @author Majrul Ansari
 * @version 3.0
 *
 */
public abstract class Logger {

	public Logger() {
		System.out.println("Logger v.3.0 by Majrul Ansari");
	}
	
	public void log(String msg) {
		//System.out.println("[INFO] [" + LocalDateTime.now()+"] "+msg);
		log(msg, LogLevel.INFO);
	}
	
	public abstract void log(String msg, LogLevel level);
	
}
