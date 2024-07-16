package com.pizzeria.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "pizza")
public class Pizza {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(nullable = false)
	private String name;
	
	@Column
	private String ingredients;

	@Column
	private String description;

	@Column(name = "photo_url")
	private String photoUrl;

	@Column
	private double price;

	// Costruttore con argomenti
	public Pizza(String name, String ingredients, String description, String photoUrl, double price) {
		this.name = name;
		this.ingredients = ingredients;
		this.description = description;
		this.photoUrl = photoUrl;
		this.price = price;
	}

	// Costruttore senza argomenti
	public Pizza() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public String getIngredients() {
		return ingredients;
	}

	public void setIngredients(String ingredients) {
		this.ingredients = ingredients;
	}

	@Override
	public String toString() {
		return "Pizza [id=" + id + ", name=" + name + ", ingredients=" + ingredients + ", description=" + description
				+ ", photoUrl=" + photoUrl + ", price=" + price + "]";
	}

	
}
