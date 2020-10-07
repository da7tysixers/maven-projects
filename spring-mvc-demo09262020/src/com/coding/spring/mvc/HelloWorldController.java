package com.coding.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HelloWorldController {
	
	//need a controller method to show initial form
	@RequestMapping(value = "/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	
	// need a controller method to process the form
	@RequestMapping(value = "/processForm")
	public String processForm() {
		return "helloworld";
	}

}
