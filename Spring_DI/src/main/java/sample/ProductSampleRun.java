package main.java.sample;

import main.java.sample.di.business.domain.Product;
import main.java.sample.di.business.service.ProductService;

public class ProductSampleRun {
	
	public static void main(String[] args) {
		ProductSampleRun productSampleRun = new ProductSampleRun();
		productSampleRun.execute();
	}
	
	@SuppressWarnings("resource")
	public void execute() {
		BeanFactory ctx = new ClassPathXmlApplicationContext("/sample/config/applicationContext.xml");
		ProductService productService = ctx.getBean(ProductService.class);
	
		productService.addproduct(new Product("ホチキス", 100));
		
		Product product = productService.findByProductName("ホチキス");
		System.out.println(product);
	}

}
