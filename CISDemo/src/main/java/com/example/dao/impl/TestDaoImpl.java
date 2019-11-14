package com.example.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.example.dao.TestDao;
import com.example.entity.Test;

@Repository
public class TestDaoImpl implements TestDao {
	
	private static Logger logger = LoggerFactory.getLogger(TestDaoImpl.class);


	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public Test getData(int id) {
		// TODO Auto-generated method stub
		logger.info("EntityManager:"+entityManager);
		
		try {
			TypedQuery<Test> query = entityManager.createNamedQuery("getData",
					Test.class);

			query.setParameter("id", 1);
		
			return query.getSingleResult();

		} catch (NoResultException e) {
			return null;
		}
	}

}
