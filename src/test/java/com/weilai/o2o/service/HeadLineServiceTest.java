package com.weilai.o2o.service;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.weilai.o2o.BaseTest;
import com.weilai.o2o.dao.HeadLineDao;
import com.weilai.o2o.entity.HeadLine;

public class HeadLineServiceTest extends BaseTest{
	@Autowired
	HeadLineService headLineServiceo;
	
	@Test
	public void testQueryHeadLine() {
		List<HeadLine> headLineList = headLineServiceo.getHeadLineList(new HeadLine());
		System.out.println(headLineList.size());
	}
	
}
