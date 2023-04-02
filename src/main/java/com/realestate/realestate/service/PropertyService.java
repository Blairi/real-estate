package com.realestate.realestate.service;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.realestate.realestate.domain.Property;
import com.realestate.realestate.repository.PropertyRepository;

@Service
public class PropertyService {
	
	@Autowired
	private PropertyRepository repository;
	
	public void addProperty(String name, double price, String description, 
			Integer bedrooms, Integer wc, Integer parking) {
		Property property = new Property(
				1, name, price, description, bedrooms, wc, parking, LocalDate.now()
			);
		repository.save(property);
	}
	
	public void addProperty(Property property) {
		repository.save(property);
	}
	
}
