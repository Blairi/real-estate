package com.realestate.realestate.domain;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Size;

@Entity
public class Property {

	@Id
	@GeneratedValue
	private int id;
	private String name;
	private double price;

	@Size(min = 10, message = "Enter atleast 10 characters")
	private String desc;
	private Integer bedrooms;
	private Integer wc;
	private Integer parking;
	private LocalDate created;

	public Property() {

	}

	public Property(int id, String name, double price, 
			String desc, Integer bedrooms, Integer wc, 
			Integer parking, LocalDate created) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.desc = desc;
		this.bedrooms = bedrooms;
		this.wc = wc;
		this.parking = parking;
		this.created = created;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public Integer getBedrooms() {
		return bedrooms;
	}

	public void setBedrooms(Integer bedrooms) {
		this.bedrooms = bedrooms;
	}

	public Integer getWc() {
		return wc;
	}

	public void setWc(Integer wc) {
		this.wc = wc;
	}

	public Integer getParking() {
		return parking;
	}

	public void setParking(Integer parking) {
		this.parking = parking;
	}

	public LocalDate getCreated() {
		return created;
	}

	public void setCreated(LocalDate created) {
		this.created = created;
	}

	@Override
	public String toString() {
		return "Property [id=" + id + ", name=" + name + ", price=" + price + ", desc=" + desc + ", bedrooms="
				+ bedrooms + ", wc=" + wc + ", parking=" + parking + ", created=" + created + "]";
	}

}
