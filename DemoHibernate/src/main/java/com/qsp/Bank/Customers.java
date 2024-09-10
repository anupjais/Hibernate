package com.qsp.Bank;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Customers {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		Query query = em.createQuery("Select s from Account s");
//		List<Account> accounts = query.getResultList();
		List<Account> accs = query.getResultList();
		
//		System.out.println(accs);
		for (Account account : accs) {
			System.out.println(account.getId());
			System.out.println(account.getName());
			System.out.println(account.getBalance());
			System.out.println("-------------------------");
		}
	}
}
