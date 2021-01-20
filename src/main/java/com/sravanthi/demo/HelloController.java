package com.sravanthi.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/hello")
	public String hello() {
		return "welcome to springs";
	}

	@PostMapping("/hello")
	public String hello1() {
		return "welcome to springs";
	}

}
