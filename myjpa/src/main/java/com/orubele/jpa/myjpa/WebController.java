package com.orubele.jpa.myjpa;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping
public class WebController {
	
	public String myModel(Model model) {
		
		return "welcome";
	}

}
