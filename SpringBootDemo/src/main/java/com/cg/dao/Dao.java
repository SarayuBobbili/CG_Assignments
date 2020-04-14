package com.cg.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

@Transactional
@Repository
public class Dao {
	
	@PersistenceContext
	EntityManager em;
	
	public List<Bank> retrieve()
	{
		Query q=em.createQuery("select b from Bank b");
		return q.getResultList();
	}
	public Bank findById(int id)
	{
		return em.find(Bank.class, id);
	}
	public List<Bank> condition()
	{
		Query q=em.createQuery("select b from Bank b where b.id>4 or name='Sarayu'");
		return q.getResultList();
	}
	public List<Bank> like()
	{
		Query q=em.createQuery("select b from Bank b where b.name like '_a%'");
		return q.getResultList();
	}
	public List<Bank> orderby()
	{
		Query q=em.createQuery("select b from Bank b order by b.id desc");
		return q.getResultList();
	}

}
