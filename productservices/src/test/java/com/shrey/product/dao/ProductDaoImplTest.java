package com.shrey.product.dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.shrey.product.dto.Product;

public class ProductDaoImplTest {

	@Test
	public void createShouldCreateAProduct() {
		
		ProductDao dao = new ProductDaoImpl();
		Product product = new Product();
		product.setId(1);
		product.setDescription("Awesome");
		product.setPrice(800);
		dao.create(product);
		Product result = dao.read(1);
		
		assertNotNull(result);
		assertEquals("Iphone",result.getName());
		//asserEquals
	}

}
