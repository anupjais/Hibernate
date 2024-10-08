package com.qsp.Personal;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.qsp.Adhar.Person;

@Entity
public class Pancard {
	@Id
	private int id;
	private String location;
	@OneToOne(mappedBy = "pan")
	private Person1 person1;
	
	
	public Pancard() {
		// TODO Auto-generated constructor stub
	}


	public Pancard(int id, String location, Person1 person1) {
		super();
		this.id = id;
		this.location = location;
		this.person1 = person1;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public Person1 getPerson1() {
		return person1;
	}


	public void setPerson1(Person1 person1) {
		this.person1 = person1;
	}
	
	
	

}
