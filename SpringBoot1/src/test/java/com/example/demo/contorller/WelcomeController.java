package com.example.demo.contorller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	@GetMapping("/msg")
	public String getMsg()
	{
		return " Hello World";
		
	}

	@GetMapping("/msg1")
	public String getMsg1()
	{
		return " Hello World";
		
	}
	
	@GetMapping("/msg2")
	public String getMsg2()
	{
		return " Hello World";
		
	}
}
