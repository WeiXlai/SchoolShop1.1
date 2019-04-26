package com.weilai.o2o.dao;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.weilai.o2o.BaseTest;
import com.weilai.o2o.entity.ShopCategory;

public class ShopCategoryDaoTest extends BaseTest {
	@Autowired
	ShopCategoryDao shopCategoryDao;
	
	@Test
	public void test() {
//		ShopCategory testCategory = new ShopCategory();
//		ShopCategory parentCategory = new ShopCategory();
//		parentCategory.setShopCategoryId(13L);
//		testCategory.setParent(parentCategory);
//		List<ShopCategory> shopCategory = shopCategoryDao.queryShopCategory(testCategory);
//		assertEquals(2, shopCategory.size());
//		System.out.println(shopCategory.get(0).getShopCategoryName());
		List<ShopCategory> shopCategory = shopCategoryDao.queryShopCategory(null);
		//assertEquals(2, shopCategory.size());
		System.out.println(shopCategory.size());
	}

}
