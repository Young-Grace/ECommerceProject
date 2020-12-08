package com.luis.tts.ECommerce.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "product_id")
	private Long id;
	
	private String name;
	
	private String description;
	
	private String imageURL;
	
	private BigDecimal price;
	
	
	//no arg constructor
	public Product () {}
	

	//arg constructor to generate Product POJOs
	public Product(String name, String description, String imageURL, BigDecimal price) {
		super();
		
		this.name = name;
		this.description = description;
		this.imageURL = imageURL;
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

	public String getImageURL() {
		return imageURL;
	}

	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}


	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public Long getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", description=" + description + ", price=" + price + "]";
	}

}
