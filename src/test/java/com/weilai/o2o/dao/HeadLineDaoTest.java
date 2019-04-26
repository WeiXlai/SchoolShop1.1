package com.weilai.o2o.dao;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.weilai.o2o.BaseTest;
import com.weilai.o2o.entity.HeadLine;

public class HeadLineDaoTest extends BaseTest {
	@Autowired
	HeadLineDao headLineDao;
	
	@Test
	public void testQueryHeadLine() {
		List<HeadLine> headLLineList = headLineDao.queryHeadLineList(new HeadLine());
		System.out.println(headLLineList.size());
	}
}
