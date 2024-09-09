package com.qsp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FetchCar {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		
		Cars car = em.find(Cars.class, 1);
		System.out.println("Fatched dates .. ");
		System.out.println(car.getId()+" : "+car.getBrand()+" "+car.getModel()+" "+car.getPrice()+".");
	}
}
