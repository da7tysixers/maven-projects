package com.coding.spring.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
	
	
	//new controller method to read new form data
	// add data to the model
	@RequestMapping("/processFormVersionTwo")
	public String shoutDude(HttpServletRequest request, Model model) {
		// read the request parameter from html form
		String theName = request.getParameter("studentName").toUpperCase();
		
		// convert data to all upper case
		
		// create message
		String result = "Yo! " + theName;
		
		// add message to the model
		model.addAttribute("message", result);
		return "helloworld";
	}

}
