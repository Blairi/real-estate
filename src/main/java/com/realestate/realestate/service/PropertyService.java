package com.realestate.realestate.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.realestate.realestate.domain.Property;
import com.realestate.realestate.repository.PropertyRepository;

import jakarta.validation.Valid;

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

	public List<Property> getAllProperties() {
		return repository.findAll();
	}
	
	public Optional<Property> findById(Integer id) {
		return repository.findById(id);
	}

	public void updateProperty(Property property) {
		repository.save(property);
	}
	
	public void deleteById(Integer id) {
		repository.deleteById(id);
	}
	
}
