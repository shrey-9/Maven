package com.shrey.product.dao;

import com.shrey.product.dto.Product;

public interface ProductDao {
	void create(Product product);

	Product read(int id);
	
	void update(Product product);
	
	void delete(int id);
}
