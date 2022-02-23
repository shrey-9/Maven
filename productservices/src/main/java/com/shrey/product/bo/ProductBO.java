package com.shrey.product.bo;

import com.shrey.product.dto.Product;

public interface ProductBO {
	
	void create(Product product);
	
	
	Product findProduct(int id);

}
