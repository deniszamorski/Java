package com.prs.db;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.prs.business.User;

public class UserDB {

	public static List<User> getAll() {
		List<User> users = new ArrayList<>();
		
		EntityManager em = DBUtil.getEmFactory().createEntityManager();
		
		try {
			Query q = em.createQuery("Select u from User u");
			users = q.getResultList();
		}
		finally {
			em.close();
		}
		
		return users;
	}
	public static User get(int id) {
		User user;
		
		EntityManager em = DBUtil.getEmFactory().createEntityManager();
		
		try {
			user = em.find(User.class, id);
			return user;
		} finally {
			em.close();
		}
	}
}
