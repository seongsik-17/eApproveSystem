package com.example.eApproveSystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


import jakarta.servlet.http.HttpSession;

@Controller
public class Maincontroller {
	
	@GetMapping("/")
	public String root() {
		return "login";
	}
	@GetMapping("/approval")
	public String approval(HttpSession session,Model model) {
		model.addAttribute("userInfo",session.getAttribute("userInfo"));
		if(session.getAttribute("userInfo") == null) {
			return "login";
		}
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
