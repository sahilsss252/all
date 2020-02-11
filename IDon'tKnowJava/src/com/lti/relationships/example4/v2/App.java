package com.lti.relationships.example4.v2;

public class App {

	public static void main(String[] args) {
		//Logger logger = new Logger();
		//ConsoleLogger logger = new ConsoleLogger();
		FileLogger logger = new FileLogger();
		logger.log("Some message");
		logger.log("Again some message", LogLevel.WARN);
		logger.log("Once again some message", LogLevel.ERROR);
		
	}
}
