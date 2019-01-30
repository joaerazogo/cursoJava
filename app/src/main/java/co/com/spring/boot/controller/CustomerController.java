package co.com.spring.boot.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.spring.boot.dto.CustomerDTO;
import co.com.spring.boot.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {	
	
	@Autowired
	private CustomerService customerService;
	
	@GetMapping
	List<CustomerDTO> getCustomers(){
		return customerService.getCustomers();
	}
}
