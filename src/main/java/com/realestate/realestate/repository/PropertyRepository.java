package com.realestate.realestate.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.realestate.realestate.domain.Property;

public interface PropertyRepository extends JpaRepository<Property, Integer>{

}
