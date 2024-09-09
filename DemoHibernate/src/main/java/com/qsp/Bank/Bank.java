package com.qsp.Bank;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Bank {
	@Id
	private int id;
	private String name;
	private String branch;
	@OneToMany
	private List<Account> accounts;
	public Bank() {
		
	}
	public Bank(int id, String name, String branch, List<Account> accounts) {
		super();
		this.id = id;
		this.name = name;
		this.branch = branch;
		this.accounts = accounts;
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

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}
	

	public List<Account> getAccounts() {
		return accounts;
	}
	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}
	@Override
	public String toString() {
		return "Bank [id=" + id + ", name=" + name + ", branch=" + branch + "]";
	}
	
	
	
}
