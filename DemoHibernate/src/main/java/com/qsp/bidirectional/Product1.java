package com.qsp.bidirectional;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Product1 {
	@Id
	private int id;
	private String name;
	private double price;
	@OneToMany(mappedBy = "product")
	private List<Review1> reviews;
	
	public Product1() {
	}

	public Product1(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public Product1(int id, String name, double price, List<Review1> reviews) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.reviews = reviews;
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

	public List<Review1> getReviews() {
		return reviews;
	}

	public void setReviews(List<Review1> reviews) {
		this.reviews = reviews;
	}

	@Override
	public String toString() {
		return "Product1 [id=" + id + ", name=" + name + ", price=" + price + ", reviews=" + reviews + "]";
	}
	
	
	
}
