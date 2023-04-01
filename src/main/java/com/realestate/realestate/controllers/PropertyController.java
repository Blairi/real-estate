package com.realestate.realestate.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PropertyController {
	
	@RequestMapping("add-property")
	public String showNewPropertyPage() {
		return "admin/property";
	}
}
