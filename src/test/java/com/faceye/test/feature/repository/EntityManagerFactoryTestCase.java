package com.faceye.test.feature.repository;

import javax.persistence.EntityManagerFactory;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.util.Assert;


public class EntityManagerFactoryTestCase extends BaseRepositoryTestCase {
	@Autowired
	private EntityManagerFactory entityManagerFactory = null;

	@Test
	public void entityManagerFactory() throws DataAccessException {
		Assert.isTrue(entityManagerFactory != null);
	}
}
