package com.qsp.Adhar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Driver {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
//		Adhar a = new Adhar();
		Adhar a = em.find(Adhar.class, 101);
//		a.setId(101);
//		a.setName("Anup");
//		a.setLocation("Pune");
		
//		Person p = new Person();
		Person p = em.find(Person.class, 1);
//		p.setId(1);
//		p.setName("Anup");
//		p.setPhone(8888);
//		p.setCard_id(a);
		
		p.setName("Rahul");
		a.setLocation("Goa");
		
		et.begin();
		em.merge(a);
		em.merge(p);
//		em.persist(p);
//		em.persist(a);
		et.commit();
		System.out.println("Committed");
		
		
		System.out.println(em.find(Person.class, 1));
		System.out.println(em.find(Adhar.class, 101));
	}
}
