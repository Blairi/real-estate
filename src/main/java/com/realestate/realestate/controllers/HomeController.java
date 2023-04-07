package com.realestate.realestate.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.realestate.realestate.domain.Property;
import com.realestate.realestate.service.PropertyService;

@Controller
public class HomeController {
	
	@Autowired
	private PropertyService service;
	
	@RequestMapping("/")
	public String showHomePage() {
		return "home";
	}
	
	@RequestMapping("/about")
	public String showAboutPage() {
		return "about";
	}
	
	@RequestMapping("/properties")
	public String showPropertiesPage(ModelMap model) {
		List<Property> properties = service.getAllProperties();
		model.put("properties", properties);
		return "properties";
	}
	
	@RequestMapping("/property")
	public String showProperty(ModelMap model, @RequestParam int id) {
		Optional<Property> property = service.findById(id);
		model.put("property", property.get());
		return "property";
	}
	
}
