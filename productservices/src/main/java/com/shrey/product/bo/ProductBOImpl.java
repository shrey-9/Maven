package com.shrey.product.bo;

import com.shrey.product.dao.ProductDao;
import com.shrey.product.dao.ProductDaoImpl;
import com.shrey.product.dto.Product;

public class ProductBOImpl implements ProductBO {
    
	
	private static ProductDao dao = new ProductDaoImpl();
	@Override
	public void create(Product product) {
      dao.create( product);
      
	}

	@Override
	public Product findProduct(int id) {
		return dao.read(id);
	}

}
