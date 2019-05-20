package com.prs.db;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.prs.business.PurchaseRequestLineItem;

public class PurchaseRequestLineItemDB {
	public static List<PurchaseRequestLineItem> getAll() {
		List<PurchaseRequestLineItem> prli = new ArrayList<>();

		EntityManager em = DBUtil.getEmFactory().createEntityManager();

		try {
			Query q = em.createQuery("Select pr from PurchaseRequestLineItem pr");
			prli = q.getResultList();
		} finally {
			em.close();
		}

		return prli;
	}
}