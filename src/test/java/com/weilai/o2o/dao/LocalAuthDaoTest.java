package com.weilai.o2o.dao;

import java.util.Date;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.weilai.o2o.BaseTest;
import com.weilai.o2o.entity.LocalAuth;
import com.weilai.o2o.entity.PersonInfo;

/**
 * 测试登录
 * @author ASUS
 *
 */
public class LocalAuthDaoTest extends BaseTest {
	@Autowired
	LocalAuthDao localAuthDao;
	
	@Test
	public void testInsert() {
		LocalAuth localAuth = new LocalAuth();
		localAuth.setUserName("ccc");
		localAuth.setPassword("123456");
		localAuth.setCreateTime(new Date());
		PersonInfo personInfo = new PersonInfo();
		personInfo.setUserId(2L);
		localAuth.setPersonInfo(personInfo);
		localAuthDao.insertLocalAuth(localAuth);
	}
	
	@Test
	public void testSectleByUserNameAndPassword() {
		
		localAuthDao.queryLocalAuth("bbb", "s05bse6q2qlb9qblls96s592y55y556s");

		
	}
	
	@Test
	public void testSectleByUserId() {
		
		localAuthDao.queryLocalAuthByUserId(1L);

		
	}
	@Test
	public void testUpdate() {
		localAuthDao.updateLocalAuth(2L, "aaa", "123456", "111111", null);
	}
	
}
