package com.faceye.test.feature.repository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
<<<<<<< HEAD
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
=======
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.Assert;
>>>>>>> aba3c61740be7cab218ca059a6ce553e84fbf750

/**
 * 基础测试用例
 * 
 * @author:haipenge
 * @Create Date:2014年5月19日
 */
<<<<<<< HEAD
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath*:/applicationContext.xml"})
abstract public class BaseRepositoryTestCase extends AbstractTransactionalJUnit4SpringContextTests{
	protected Logger logger=LoggerFactory.getLogger(getClass());
=======

@RunWith(SpringRunner.class)
@ContextConfiguration(locations = { "classpath:/applicationContext.xml" })
//extends AbstractJUnit4SpringContextTests
public class BaseRepositoryTestCase{
	protected Logger logger = LoggerFactory.getLogger(getClass());

	@Test
	public void testEnv() throws Exception {
		Assert.isTrue(true);
	}
>>>>>>> aba3c61740be7cab218ca059a6ce553e84fbf750
}
