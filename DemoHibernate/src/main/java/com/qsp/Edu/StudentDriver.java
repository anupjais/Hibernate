package com.qsp.Edu;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class StudentDriver {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Subject s1 = new Subject(101, "Java", "Tejus");
		Subject s2 = new Subject(102, "SQL", "Ravi Teja");
		Subject s3 = new Subject(103, "JS", "Shrikant");
		Subject s4 = new Subject(104, "React", "Prashad");
		Subject s5 = new Subject(105, "J2EE", "Sandeep");
		Subject s6 = new Subject(106, "Manual", "Kedar Nath");
		
		Student student1 = new Student();
		student1.setId(10);
		student1.setName("Virat");
		student1.setPhone(888);
//		student1.set
	}

}
