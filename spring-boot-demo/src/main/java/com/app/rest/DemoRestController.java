package com.app.rest;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {
	
	@GetMapping("/")
	public String sayHello()
	{
		return "Time on the Server : "+LocalDateTime.now();
	}
	
	@PostMapping(path = "/hello/{id}")
	public String sayhello(@PathVariable int id)
	{
		return "In post"+id;
	}
	
	

}
