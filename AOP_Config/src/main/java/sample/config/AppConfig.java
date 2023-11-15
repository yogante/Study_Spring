package sample.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import sample.aop.MyFirstAspect;
import sample.aop.business.service.ProductServiceImpl;
import sample.aop.dataaccess.ProductDaoImpl;

@Configuration
@EnableAspectJAutoProxy

public class AppConfig {

	@Bean
	public ProductServiceImpl productService() {
		return new ProductServiceImpl();
	}
	
	@Bean 
	public ProductDaoImpl productDao() {
		return new ProductDaoImpl();
	}
	
	@Bean
	public MyFirstAspect myFirstAspect() {
		return new MyFirstAspect();
	}
}
