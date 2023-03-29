package com.realestate.realestate.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String showHomePage() {
		return "home";
	}
	
	@RequestMapping("/about")
	public String showAboutPage() {
		return "about";
	}
	
	@RequestMapping("/properties")
	public String showPropertiesPage() {
		return "properties";
	}
	
	// TODO: remove this RequestMapping
	@RequestMapping("/dashboard")
	public String showDashboardPage() {
		return "dashboard";
	}
}
