package com.lti.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component("md2")
public class MyDao2 {
	
	public String printmsg(){
	return "i am MyDao2";
	}
}
