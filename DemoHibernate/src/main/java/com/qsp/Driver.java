package com.qsp;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Driver {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		System.out.println("Created");
		System.out.println(emf);
		
//		Student1 s1 = new Student1(12, "Mistry");
	}

}
