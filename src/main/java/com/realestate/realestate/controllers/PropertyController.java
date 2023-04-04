package com.realestate.realestate.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.realestate.realestate.domain.Property;
import com.realestate.realestate.service.PropertyService;

@Controller
public class PropertyController {
	
	@Autowired
	private PropertyService service;
	
	@RequestMapping(value="add-property", method = RequestMethod.GET)
	public String showNewPropertyPage() {
		return "admin/property";
	}
	
	@RequestMapping(value="add-property", method = RequestMethod.POST)
	public String addNewProperty(ModelMap model, Property property) {
		service.addProperty(property);
		return "redirect:dashboard";
	}
	
	@RequestMapping(value="/dashboard", method = RequestMethod.GET)
	public String showDashboardPage(ModelMap model) {
		List<Property> properties = service.getAllProperties();
		model.put("properties", properties);
		return "admin/dashboard";
	}
}
