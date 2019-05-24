package com.superhero.db;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.superhero.business.superhero;
import com.superhero.db.DBUtil;

public class superherodb {

	public static List<superhero> getAll() {
		List<superhero> heroes = new ArrayList<>();

		EntityManager em = DBUtil.getEmFactory().createEntityManager();

		try {
			Query q = em.createQuery("Select p from superhero p");
			heroes = q.getResultList();
		} finally {
			em.close();
		}

		return heroes;
	}
}
