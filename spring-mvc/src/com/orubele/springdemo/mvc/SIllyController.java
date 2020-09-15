package com.orubele.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SIllyController {
	
	@RequestMapping("/showForm")
	public String diplayTheForm() {
		return "silly";
	}
}
