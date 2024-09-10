package com.qsp.Edu;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Subject {
	@Id 
	private int id;
	private String name;
	private String trainer;
	
	public Subject() {
	}

	public Subject(int id, String name, String trainer) {
		super();
		this.id = id;
		this.name = name;
		this.trainer = trainer;
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

	public String getTrainer() {
		return trainer;
	}

	public void setTrainer(String trainer) {
		this.trainer = trainer;
	}

	@Override
	public String toString() {
		return "Subject [id=" + id + ", name=" + name + ", trainer=" + trainer + "]";
	}
	
	

}
