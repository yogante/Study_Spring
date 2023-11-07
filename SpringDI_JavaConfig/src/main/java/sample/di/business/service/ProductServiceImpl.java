package sample.di.business.service;

import org.springframework.beans.factory.annotation.Autowired;

import sample.di.business.domain.Product;

public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductDao productDao;

	public void addProduct(Product product) {
		productDao.addProduct(product);
	}

	public Product findByProductName(String name) {
		 return productDao.findByProductName(name);
	}
}