package com.superhero.db;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DBUtil {
	private static final EntityManagerFactory emf = 
			Persistence.createEntityManagerFactory("superheroJPADemo");
	
	public static EntityManagerFactory getEmFactory() {
		return emf;
	}
	
	public static void closeEMF() {
		emf.close();
	}
}
