package com.orubele.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	//Controller requesting
	@RequestMapping("/")
	public String showPage() {
		return "main-menu";
	}

}
