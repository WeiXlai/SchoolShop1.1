package com.weilai.o2o.service;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.weilai.o2o.BaseTest;
import com.weilai.o2o.entity.Shop;
import com.weilai.o2o.entity.ShopCategory;

public class ShopCategoryServiceTest extends BaseTest {
	@Autowired
	ShopCategoryService shopCategoryService;
	
	@Test
	public void testGetShopCategoryLsit() {
		ShopCategory shopCondition = new ShopCategory();
		ShopCategory parentCategory = new ShopCategory();
		parentCategory.setShopCategoryId(10L);
		shopCondition.setParent(parentCategory);
		
		shopCategoryService.getShopCategory(shopCondition);
	}
}
