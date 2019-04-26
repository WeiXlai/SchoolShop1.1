package com.weilai.o2o.service;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.weilai.o2o.BaseTest;
import com.weilai.o2o.entity.ProductCategory;

public class ProductCategoryServiceTest extends BaseTest {
	@Autowired
	ProductCategoryService productCategoryService;
	
	@Test
	public void testGetProductCategory() {
		long shopId = 33L;
		List<ProductCategory> categoryList = productCategoryService.getProductCategoryList(shopId);
		for (ProductCategory productCategory : categoryList) {
			System.out.println(productCategory);
		}
	}
	
	
	
}
