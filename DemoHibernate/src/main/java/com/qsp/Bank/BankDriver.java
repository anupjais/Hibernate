package com.qsp.Bank;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class BankDriver {
	public static void main(String[] args) {
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
//		Bank b = new Bank(1,"SBI", "Deccan");
		Bank b = new Bank();
		b.setId(1);
		b.setName("SBI");
		b.setBranch("Deccan");
		
//		Account a1=new Account(1,"Anup",150, );
		Account a2 = new Account();
		a2.setId(2);
		a2.setName("Anup");
		a2.setBalance(150);
		
		Account a3 = new Account();
		a3.setId(3);
		a3.setName("Pratiksha");
		a3.setBalance(500);
		
		List<Account> list = new ArrayList<Account>();
		list.add(a2);
		list.add(a3);
		
		b.setAccounts(list);
		
		et.begin();
//		em.persist(list);
		em.persist(a2);
		em.persist(a3);
		em.persist(b);
		et.commit();
		
		System.out.println("Data committed.");
		
//		a2.set
		
	}
}
