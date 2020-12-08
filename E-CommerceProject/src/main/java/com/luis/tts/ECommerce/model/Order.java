package com.luis.tts.ECommerce.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Order {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "order_id")
	private Long id;
	
	//TODO: list of items
	
	//TODO: object customer
	
	private BigDecimal total;
	
	
	//no arg constructor
	public Order () {}
	

	//arg constructor to generate Product POJOs
	public Order(BigDecimal total) {
		super();
		
		this.total = total;
		
	}


	public BigDecimal getTotal() {
		return total;
	}


	public void setTotal(BigDecimal total) {
		this.total = total;
	}


	public Long getId() {
		return id;
	}
	
	
}
