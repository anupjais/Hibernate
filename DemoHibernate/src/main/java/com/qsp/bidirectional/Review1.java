package com.qsp.bidirectional;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Review1 {
	@Id
	private int id;
	private String message;
	
	@ManyToOne
	@JoinColumn(name = "p_id")
	private Product1 product;
	
	public Review1() {
	}

	public Review1(int id, String message) {
		super();
		this.id = id;
		this.message = message;
	}

	public Review1(int id, String message, Product1 product) {
		super();
		this.id = id;
		this.message = message;
		this.product = product;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Product1 getProduct() {
		return product;
	}

	public void setProduct(Product1 product) {
		this.product = product;
	}

	@Override
	public String toString() {
		return "Review1 [id=" + id + ", message=" + message + ", product=" + product + "]";
	}
	
	

}
