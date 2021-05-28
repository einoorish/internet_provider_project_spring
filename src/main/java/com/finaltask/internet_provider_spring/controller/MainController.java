package com.finaltask.internet_provider_spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.finaltask.internet_provider_spring.domain.TariffType;
import com.finaltask.internet_provider_spring.repos.TariffRepo;
import com.finaltask.internet_provider_spring.repos.UserRepo;

@Controller
public class MainController {
	@Autowired
	private UserRepo userRepo;
	@Autowired
	private TariffRepo tariffRepo;

	@GetMapping("/")
	public String home(Model model) {
		model.addAttribute("title", "Main page");
		model.addAttribute("tariffs", tariffRepo.findAll());
		return "home";
	}
	
	@PostMapping("filter")
	public String filter(@RequestParam String type, Model model) {
		model.addAttribute("tariffs", tariffRepo.findByType(TariffType.valueOf(type)));
		
		return "home";
	}
	
}
