package com.sample.springmvc.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class TestController {

	@GetMapping
	public String firstPage() {
		System.out.println("**Inside First Page ******");
		return "redirect:/hi";
	}
	
	@GetMapping("/hi")
	public String SecondPage() {
		System.out.println("**Inside Second Page ******");
		return "welcome";
	}

}