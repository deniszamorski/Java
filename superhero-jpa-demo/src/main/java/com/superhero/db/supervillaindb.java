package com.superhero.db;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.superhero.business.supervillain;
import com.superhero.db.DBUtil;

public class supervillaindb {

	public static List<supervillain> getAll() {
		List<supervillain> villains = new ArrayList<>();

		EntityManager em = DBUtil.getEmFactory().createEntityManager();

		try {
			Query q = em.createQuery("Select p from supervillain p");
			villains = q.getResultList();
		} finally {
			em.close();
		}

		return villains;
	}
}
