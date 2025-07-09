package com.example.eApproveSystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Maincontroller {
	
	@GetMapping("/")
	public String root() {
		return "login";
	}
	@GetMapping("/approval")
	public String approval() {
		return "approval";
	}
	
	@GetMapping("/loginForm")
	public String loginForm() {
		return "login";
	}
	@GetMapping("/registForm")
	public String registForm() {
		return "registForm";
	}
}
