package com.faceye.test.feature.repository;

import javax.persistence.EntityManager;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;

public class EntityManagerTestCase extends BaseRepositoryTestCase {

	@Autowired
	private EntityManager entityManager =null;
	@Test
	public void entityManager() throws Exception{
		Assert.isTrue(entityManager!=null);
	}
}
