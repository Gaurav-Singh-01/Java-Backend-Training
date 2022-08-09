package com.example.SpringBootDemo.Controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class HomeController {
	
	@GetMapping("/")
	public String getGetMsg() {
		return "Spring Boot Get";
	}
	
	@PostMapping("/")
	public String getPostMsg() {
		return "Spring Boot Post";
	}
	
	@PutMapping("/")
	public String getPutMsg() {
		return "Spring Boot Put";
	}
	
	@DeleteMapping("/")
	public String getDeleteMsg() {
		return "Spring Boot Delete";
	}

}
