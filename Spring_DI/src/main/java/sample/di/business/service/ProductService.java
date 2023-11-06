package main.java.sample.di.business.service;

import main.java.sample.di.business.domain.Product;

public interface ProductService {
	void addproduct(Product product);
	Product findByProductName(String name);
}
