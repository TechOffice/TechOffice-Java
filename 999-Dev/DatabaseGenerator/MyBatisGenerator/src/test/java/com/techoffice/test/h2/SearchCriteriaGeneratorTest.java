package com.techoffice.test.h2;

import org.junit.Test;

import com.techoffice.database.dao.EntityDao;
import com.techoffice.database.model.Entity;
import com.techoffice.mybatis.generator.CriteriaGenerator;
import com.techoffice.test.h2.base.BaseH2GeneratorTest;

public class SearchCriteriaGeneratorTest extends BaseH2GeneratorTest {

	@Test
	public void test(){
		EntityDao entityDao = getEntityDao();
		Entity entity = entityDao.getEntity("TEST");
		String content = CriteriaGenerator.generate(entity);
		System.out.println(content);
	}
}
