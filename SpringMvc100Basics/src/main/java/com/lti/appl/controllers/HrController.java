
package com.lti.appl.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HrController {
	
	@RequestMapping(name="/")
	public String getHomePage(){
		return "/WEB-INF/jsps/Home.jsp";
	}
}
