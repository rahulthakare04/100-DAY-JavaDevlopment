package com.rahulthakare.fristdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RahulController {
	
	@GetMapping("/")
	public String homePage() {
		return "index.html";
	}

}
