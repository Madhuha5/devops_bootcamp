package com;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Messageservice {
	@GetMapping("/hello")
	public String sayHello() {
		return "hello";
	}
}
