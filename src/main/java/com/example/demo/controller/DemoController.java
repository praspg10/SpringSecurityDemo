package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	@GetMapping("/hello")
	public String getHello() {
		return new String("HELLO,You are sucessfully authenticated "+System.currentTimeMillis());
	}
	
	@GetMapping("/welcome")
	public String getWelcome() {
		return new String("WELCOME,You are sucessfully authenticated "+System.currentTimeMillis());
	}
	
}
