package com.example.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloworldController {
	
	@GetMapping("/hello")
	public String sayHello() {
		return "hello world";
	}

}
