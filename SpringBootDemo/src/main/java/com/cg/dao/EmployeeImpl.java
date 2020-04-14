package com.cg.dao;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class EmployeeImpl {
	
	@PersistenceContext
	EntityManager em;
	
	public void create(Bank b)
	{
		em.persist(b);
	}

}
