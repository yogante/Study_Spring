package main.java.sample.di.business.service;

import main.java.sample.di.business.domain.Product;

public interface ProductDao {
	void addProduct(Product product);
	Product findByProductName(String name);
		
}
