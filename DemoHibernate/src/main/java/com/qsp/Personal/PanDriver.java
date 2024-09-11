package com.qsp.Personal;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class PanDriver {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Person1 p1 = new Person1();
		p1.setId(13);
		p1.setName("Samantha");
		p1.setPhone(98765432l);

		Person1 p2 = new Person1();
		p2.setId(14);
		p2.setName("Jaicky Chain");
		p2.setPhone(46356l);
		
		Pancard pan1 = new Pancard();
		pan1.setId(103);
		pan1.setLocation("Mumbai");
		pan1.setPerson1(p1);

		Pancard pan2 = new Pancard();
		pan2.setId(104);
		pan2.setLocation("Mumbai");
		pan2.setPerson1(p2);
		
		p1.setPan(pan2);
		p2.setPan(pan1);
		et.begin();
		em.persist(pan2);
		em.persist(pan1);
		em.persist(p2);
		em.persist(p1);
		et.commit();
		
		System.out.println("Data passed");
		
	}
}
