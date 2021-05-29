package com.finaltask.internet_provider_spring.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.finaltask.internet_provider_spring.domain.TariffType;
import com.finaltask.internet_provider_spring.domain.User;
import com.finaltask.internet_provider_spring.domain.UserRole;
import com.finaltask.internet_provider_spring.repos.TariffRepo;
import com.finaltask.internet_provider_spring.repos.UserRepo;

@Controller
public class MainController {
	@Autowired
	private UserRepo userRepo;
	@Autowired
	private TariffRepo tariffRepo;
	
	@GetMapping("/")
	public String home(@RequestParam(name="type", required=false, defaultValue="INTERNET") String type, Model model) {
		model.addAttribute("title", "Home");
		model.addAttribute("tariffs", tariffRepo.findByType(TariffType.valueOf(type)));
		return "home";
	}

    @GetMapping("/registration")
    public String registration() {
        return "home";
    }

    @GetMapping("/logout")
    public String logout() {
    	SecurityContextHolder.getContext().setAuthentication(null);
        return "redirect:/";
    }

    @GetMapping("/login")
    public String login() {
        return "redirect:/";
    }

    @PostMapping("/registration")
    public String addUser(User user, Model model) {
    	BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String encodedPassword = passwordEncoder.encode(user.getPassword());
        user.setPassword(encodedPassword);
        userRepo.save(user);
        
        model.addAttribute(user);
        return "redirect:/";
    }
    
}
