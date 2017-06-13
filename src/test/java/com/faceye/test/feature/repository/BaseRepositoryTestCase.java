package com.faceye.test.feature.repository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.Assert;

/**
 * 基础测试用例
 * 
 * @author:haipenge
 * @Create Date:2014年5月19日
 */

@RunWith(SpringRunner.class)
@ContextConfiguration(locations = { "classpath:/applicationContext.xml" })
//extends AbstractJUnit4SpringContextTests
public class BaseRepositoryTestCase{
	protected Logger logger = LoggerFactory.getLogger(getClass());

	@Test
	public void testEnv() throws Exception {
		Assert.isTrue(true);
	}
}
