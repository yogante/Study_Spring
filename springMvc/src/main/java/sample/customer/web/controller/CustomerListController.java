package sample.customer.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import sample.customer.biz.domain.Customer;
import sample.customer.biz.service.CustomerService;

@Controller
public class CustomerListController {
	
	@Autowired
	private CustomerService customerService; 
	
	@RequestMapping(path = "/customer/{customerId}", method = GET)
    public String showCustomerDetail(@PathVariable int customerId, Model model)
                                        throws DataNotFoundException{
        Customer customer = customerService.findById(customerId);
        model.addAttribute("customer", customer);
        return "customer/detail";
    }
}
