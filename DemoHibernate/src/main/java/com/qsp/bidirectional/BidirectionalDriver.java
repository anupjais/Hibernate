package com.qsp.bidirectional;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class BidirectionalDriver {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Product1 p = new Product1(102, "Samsung Fold 5", 123000);
		
		Review1 r1 = new Review1(13, "Awesome Phone");
		Review1 r2 = new Review1(14, "Kachada Phone");
		Review1 r3 = new Review1(15, "Hinge in not proper");
		
		r1.setProduct(p);
		r2.setProduct(p);
		r3.setProduct(p);
		
		List<Review1> list = new ArrayList<Review1>();
		list.add(r1);
		list.add(r2);
		list.add(r3);
		
		p.setReviews(list);
		
		et.begin();
		em.persist(p);
		em.persist(r1);
		em.persist(r2);
		em.persist(r3);
		et.commit();
		System.out.println("Saved");
	}

}
