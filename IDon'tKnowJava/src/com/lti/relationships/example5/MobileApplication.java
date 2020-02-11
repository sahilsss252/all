package com.lti.relationships.example5;

/**
 * 
 * @author Google
 *
 */
public interface MobileApplication {

	public void start();
	public void pause();
	public void stop();
	
	public default void info() {
		System.out.println("Developed by Google for Android");
	}
}
