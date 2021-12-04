package com.helloworld.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@Value("${value.of.helloworld}")//reads from properties file.
	private String helloWorld;
	
	@GetMapping("/hello")
	public HelloWorld getWelcomeMessage() {
		
		return new HelloWorld(helloWorld);
	}
}

