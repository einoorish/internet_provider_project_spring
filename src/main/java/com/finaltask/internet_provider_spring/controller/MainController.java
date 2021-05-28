package com.finaltask.internet_provider_spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.finaltask.internet_provider_spring.repos.UserRepo;

@Controller
public class MainController {
	@Autowired
	private UserRepo userRepo;

	@GetMapping("/")
	public String home(Model model) {
		model.addAttribute("title", "Main page");
		return "home";
	}
	
	@GetMapping("/users")
	public String users(Model model) {
		model.addAttribute("users", userRepo.findAll());
		return "home";
	}
}
