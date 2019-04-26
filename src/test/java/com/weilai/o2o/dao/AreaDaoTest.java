package com.weilai.o2o.dao;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.weilai.o2o.BaseTest;
import com.weilai.o2o.entity.Area;

public class AreaDaoTest extends BaseTest {
	@Autowired
	private AreaDao areaDao;
	
	@Test
	
	public void testQueryArea() {
		System.out.println(11);
		List<Area> areaList = areaDao.queryArea();
		//System.out.println(areaList);
		assertEquals(2,areaList.size());
	}
	
}
