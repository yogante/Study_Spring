package sample.di.business.service;

import sample.di.business.domain.Product;

public interface ProductService {
	void addproduct(Product product);
	Product findByProductName(String name);
}
