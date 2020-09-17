package ca.sheridancollege.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController2 {
	
	
	// with Thymeleaf in pom.xml -- works
	@PostMapping("/postTest2")	
	public String goHome2() {
		return "home2.html"; // home2.html is in /templates 
	}

	// without Thymeleaf in pom.xml -- doesn't work: Request method 'POST' not supported; 405 error
	@PostMapping("/postTest")	
	public String goHome() {
		return "home.html"; // home.html is in /static
	}
}
