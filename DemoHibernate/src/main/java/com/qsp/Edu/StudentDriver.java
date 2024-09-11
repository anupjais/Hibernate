package com.qsp.Edu;

import java.util.ArrayList;
import java.util.List;

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
		
		Student student2 = new Student();
		student2.setId(11);
		student2.setName("Rohit");
		student2.setPhone(999);
		
		Student student3 = new Student();
		student3.setId(12);
		student3.setName("Tylor Swift");
		student3.setPhone(284376);
		
		List<Subject> list = new ArrayList<Subject>();
		list.add(s1);
		student1.setSubjects(list);
		
		List<Subject> list2 = new ArrayList<Subject>();
		list2.add(s1);
		list2.add(s2);
		student2.setSubjects(list2);

		List<Subject> list3 = new ArrayList<Subject>();
		list3.add(s1);
		list3.add(s2);
		list3.add(s6);
		student3.setSubjects(list3);
//		list.add(s2);
//		list.add(s3);
//		list.add(s4);
//		list.add(s5);
//		list.add(s6);
		
		
//		student1.setSubjects(s1);
		System.out.println("Data insertion starts");
//		System.out.println("Data insertion starts");
		et.begin();
		em.persist(s1);
		em.persist(s2);
		em.persist(s3);
		em.persist(student1);
		em.persist(student2);
		em.persist(student3);
		et.commit();
		
		System.out.println("Data inserted.");
	}

}
