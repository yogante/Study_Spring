package main.java.sample.di.business.service;


import org.graalvm.compiler.lir.CompositeValue.Component;

import main.java.sample.di.business.domain.Product;

@Component
public class ProductServiceImpl implements ProductService{
	@Autowired 
	private ProductDao productDao;
	
	public void addProduct(Product product) {
		productDao.addProduct(product);
	}
	
	public Product findByProductName(String name){
		return productDao.findByProductName(name);
	}
	
}
		

