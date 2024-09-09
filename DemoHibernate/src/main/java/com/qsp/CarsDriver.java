package com.qsp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class CarsDriver {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
//		Cars c1 = new Cars();
//		c1.setId(2);
//		c1.setBrand("Lexus");
//		c1.setModel("NX 350h Exquisite");
//		c1.setPrice(67.35);
		
//		Cars c2 = new Cars(3, "Lexus", "NX Overtrail", 71.17);
		Cars c3 = new Cars(4, "Lexus", "NX 350h F SPORT", 74.24);
		Cars c4 = new Cars(5, "Lexus", "EX 300h Equisite", 63.10);
		Cars c5 = new Cars(6, "Lexus", "EX 300h Luxury Plus", 69.70);
		Cars c6 = new Cars(6, "Lexus", "LM 350h 4 Seater Ultra Luxury", 250.00);
		Cars c7 = new Cars(6, "Lexus", "LM 350h 7 Seater VIP", 200.00);
		
		et.begin();
//		em.persist(c1);
//		em.persist(c2);
		em.persist(c3);
		em.persist(c4);
		em.persist(c5);
		em.persist(c6);
		em.persist(c7);
		et.commit();
		
		System.out.println("Inserted");
	}

}
