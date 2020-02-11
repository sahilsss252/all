package com.lti.collections;

import java.util.HashMap;
import java.util.Map;

public class Example3 {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("192.168.12.1", "majrul");
		map.put("192.168.12.2", "nikhil");
		map.put("192.168.12.3", "dinesh");
		map.put("192.168.12.1", "gaurav");
		
		System.out.println(map.get("192.168.12.1"));	
	}
}
