package com.qsp.Adhar;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Person {
	@Id
	private int id;
	private String name;
	private long phone;
	
	@OneToOne
	private Adhar card_id;
	Person(){
		
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
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public Adhar getCard_id() {
		return card_id;
	}
	public void setCard_id(Adhar card_id) {
		this.card_id = card_id;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", phone=" + phone + ", card_id=" + card_id + "]";
	}
	
	
}
