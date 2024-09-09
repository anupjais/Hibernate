package com.qsp.Product;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class ProductDriver {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		/*Product p = new Product();
		p.setId(12);
		p.setName("Marker");
		p.setPrice(20);
		
		
		Review r1 = new Review();
		r1.setId(2);
		r1.setMsg("Alcoholic");
		r1.setRating(4);
		
		Review r2 = new Review();
		r2.setId(3);
		r2.setMsg("Very good");
		r2.setRating(10);
		
		r1.setProd(p);
		r2.setProd(p);
		
		et.begin();
		em.persist(r2);
		em.persist(r1);
		em.persist(p);
		et.commit();*/
		System.out.println("Products Committed.");
		
		System.out.println(em.find(Product.class, 12));;
		System.out.println(em.find(Review.class, 2));;
	}
}
