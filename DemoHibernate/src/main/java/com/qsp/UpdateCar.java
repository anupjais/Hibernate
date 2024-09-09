package com.qsp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateCar {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Cars c = em.find(Cars.class, 1);
		c.setModel("NX 350h Luxury");
		c.setPrice(72.07);
		et.begin();
		em.merge(c);
		et.commit();
	}
}
