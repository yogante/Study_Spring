package main.java.sample.di.dataaccess;

import java.util.HashMap;
import java.util.Map;

import org.graalvm.compiler.lir.CompositeValue.Component;

import main.java.sample.di.business.domain.Product;
import main.java.sample.di.business.service.ProductDao;


@Component
public class ProductDaoImpl implements ProductDao {
	private Map<String, Product> storage = new HashMap<String, Product>();
	
	public Product findProductByName(String name) {
		return storage.get(name);
	}
	
	public void addProduct(Product product) {
		storage.put(product.getName(), product);
	}
}
