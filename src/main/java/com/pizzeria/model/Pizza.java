package com.pizzeria.model;

public class Pizza {
	
	private String name;
	private String description;
	private String photoUrl;
	private double price;
	
	public Pizza(String name, String description, String photoUrl, double price) {
		super();
		this.name = name;
		this.description = description;
		this.photoUrl = photoUrl;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPhotoUrl() {
		return photoUrl;
	}

	public void setPhotoUrl(String photoUrl) {
		this.photoUrl = photoUrl;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
}
