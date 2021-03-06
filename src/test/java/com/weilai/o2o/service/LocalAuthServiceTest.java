package com.weilai.o2o.service;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.weilai.o2o.BaseTest;
import com.weilai.o2o.entity.LocalAuth;
import com.weilai.o2o.entity.PersonInfo;

public class LocalAuthServiceTest extends BaseTest {
	@Autowired
	LocalAuthService localAuthService;
	
	@Test
	public void testBindLocalAuth() {
		LocalAuth localAuth = new LocalAuth();
		localAuth.setUserName("eee");
		localAuth.setPassword("123");
		PersonInfo personInfo = new PersonInfo();
		personInfo.setUserId(14L);
		localAuth.setPersonInfo(personInfo);
		localAuthService.bindLocalAuth(localAuth);
	}
	
	@Test
	public void testSectleByUserNameAndPassword() {
		
		LocalAuth localAuth = localAuthService.getLocalAuth("bbb", "123456");
		assertEquals("bbb", localAuth.getUserName());
		
	}
	
	@Test
	public void testSectleByUserId() {
		
		localAuthService.getLocalAuthByUserId(1L);

		
	}
	
	@Test
	public void testModifyLocalAuth() {
//		String username = "bbb";
//		long userId = 2L;
//		String password = "123456";
//		String newPassword = "123";
//		Date lastEditTime = null;
		localAuthService.modifyLocalAuth(2L, "bbb", "123456", "12");
		
	}
	
}
