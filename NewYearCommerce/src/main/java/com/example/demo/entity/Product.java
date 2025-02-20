package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "product")
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="product_name", nullable=false)
	private String name;
	
	@Column(name="product_price", nullable=false)
	private float price;
	
	@Column(name="inventory_amount", nullable=false)
	private int inventory_amount;
	
	@Column(name="image_name", nullable=false)
	private String image;
	
	@Column(name="product_category", nullable=false)
	private int categoryId;
	
	@Column(name="product_description", nullable=false)
	private String description;
	
	@Column(name="product_rating", nullable=false)
	private float rating;
	
	public Product() {}

	public Product(String name, float price, int inventory_amount, String image, int category_id, String description,
			float rating) {
		super();
		this.name = name;
		this.price = price;
		this.inventory_amount = inventory_amount;
		this.image = image;
		this.categoryId = category_id;
		this.description = description;
		this.rating = rating;
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

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getInventory_amount() {
		return inventory_amount;
	}

	public void setInventory_amount(int inventory_amount) {
		this.inventory_amount = inventory_amount;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public int getCategory_id() {
		return categoryId;
	}

	public void setCategory_id(int category_id) {
		this.categoryId = category_id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public float getRating() {
		return rating;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}
	
}
