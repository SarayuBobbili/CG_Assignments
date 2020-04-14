package com.cg.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class DaoAccess {
	
	@PersistenceContext
	EntityManager em;
	
	public List retrieve()
	{
		Query q=em.createQuery("select b from Bank b");
		return q.getResultList();
	}

}
