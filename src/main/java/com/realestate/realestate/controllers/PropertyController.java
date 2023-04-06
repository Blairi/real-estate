package com.realestate.realestate.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.realestate.realestate.domain.Property;
import com.realestate.realestate.service.PropertyService;

import jakarta.validation.Valid;

@Controller
public class PropertyController {
	
	@Autowired
	private PropertyService service;
	
	@RequestMapping(value="add-property", method = RequestMethod.GET)
	public String showNewPropertyPage(ModelMap model) {
		Property property = new Property();
		model.put("property", property);
		return "admin/property";
	}
	
	@RequestMapping(value="add-property", method = RequestMethod.POST)
	public String addNewProperty(ModelMap model, Property property) {
		service.addProperty(property);
		return "redirect:dashboard";
	}
	
	@RequestMapping(value="update-property", method = RequestMethod.GET)
	public String showUpdatePropertyPage(@RequestParam Integer id, Model model) {
		Optional<Property> property = service.findById(id);
		model.addAttribute("property", property);
		return "admin/property";
	}
	
	@RequestMapping(value="update-property", method = RequestMethod.POST)
	public String updateProperty(ModelMap model, @Valid Property property, BindingResult result) {
//		if(result.hasErrors()) {
//			return "property";
//		}
		service.updateProperty(property);
		return "redirect:dashboard";
	}
	
	@RequestMapping(value="/dashboard", method = RequestMethod.GET)
	public String showDashboardPage(ModelMap model) {
		List<Property> properties = service.getAllProperties();
		model.put("properties", properties);
		return "admin/dashboard";
	}
	
	@RequestMapping(value = "delete-property", method = RequestMethod.GET)
	public String deleteProperty(@RequestParam Integer id) {
		service.deleteById(id);
		return "redirect:dashboard";
	}
	
}
