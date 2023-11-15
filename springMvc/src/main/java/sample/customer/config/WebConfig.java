package sample.customer.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.Validator;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import org.springframework.web.servlet.config.annotation.DelegatingWebMvcConfiguration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

@Configuration
@ComponentScan({"sample.customer.web.controller", "sample.user.web.controller"})
public class WebConfig extends DelegatingWebMvcConfiguration {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/resources/**")
            .addResourceLocations("/WEB-INF/resource/");
    }

    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {
        registry.jsp("/WEB-INF/views/", ".jsp");
    }
    
    @Override
    @Bean
    public RequestMappingHandlerMapping requestMappingHandlerMapping() {
    	RequestMappingHandlerMapping handlerMapping =
    			super.requestMappingHandlerMapping();
    	handlerMapping.setRemoveSemicolonContent(false);
    	
    	return handlerMapping;
    }

    @Autowired
    private MessageSource messageSource;

    @Override
    public Validator getValidator() {
        LocalValidatorFactoryBean validatorBean
                    = new LocalValidatorFactoryBean();
        validatorBean.setValidationMessageSource(messageSource);

        return validatorBean;
    }
}
