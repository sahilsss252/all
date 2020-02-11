package com.lti.relationships.example4.v2;

import java.io.FileWriter;
import java.net.Inet4Address;
import java.time.LocalDateTime;

public class FileLogger extends Logger {

	public void log(String msg, LogLevel level) {
		String ip = "127.0.0.1";
		try {
			ip = Inet4Address.getLocalHost().getHostAddress();
		}
		catch(Exception e) {
			//we will ignore the catch for now
		}
		
		try(FileWriter fw = new FileWriter("app.log")) {
			switch(level) {
			case INFO:
				fw.write("[INFO] [" + ip +"] [" + LocalDateTime.now()+"] "+msg);
				break;
			case WARN:
				fw.write("[WARNING] [" + ip +"] [" + LocalDateTime.now()+"] "+msg);
				break;
			case ERROR:
				fw.write("[ERROR] [" + ip +"] [" + LocalDateTime.now()+"] "+msg);
			}
		}catch(Exception e) {
			//we will ignore the catch for now
		}
	}
}
