package com.weilai.o2o.service;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.weilai.o2o.BaseTest;
import com.weilai.o2o.entity.Area;

public class AreaServiceTest extends BaseTest {
	@Autowired
	AreaService areaServie;
	
	@Autowired
	CacheService cacheService;
	
	@Test
	public void test() {
		List<Area> areaList = areaServie.getAreaList();
		System.out.println(areaList);
		//移除Redis中的key
		cacheService.removeFromCache(areaServie.AREALISTKEY);
		areaList = areaServie.getAreaList();
	}

}
