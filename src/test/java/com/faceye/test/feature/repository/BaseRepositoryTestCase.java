package com.faceye.test.feature.repository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.junit.Assert;


/**
 * 基础测试用例
 * 
 * @author:haipenge
 * @Create Date:2014年5月19日
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath*:/applicationContext.xml"})
abstract public class BaseRepositoryTestCase extends AbstractTransactionalJUnit4SpringContextTests{
	
	protected Logger logger = LoggerFactory.getLogger(getClass());

	@Test
	public void testEnv() throws Exception {
		Assert.assertTrue(true);
	}

}
