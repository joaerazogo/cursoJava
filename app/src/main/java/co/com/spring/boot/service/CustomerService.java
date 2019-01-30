package co.com.spring.boot.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import co.com.spring.boot.dto.CustomerDTO;

@Service
public class CustomerService {

	List<CustomerDTO> customers = new ArrayList<CustomerDTO>();
	
	public CustomerService() {
		CustomerDTO customerDTO = new CustomerDTO();
		customerDTO.setId(UUID.randomUUID().toString());
		customerDTO.setNombre("OE");
		
		CustomerDTO customerDTO2 = new CustomerDTO();
		customerDTO2.setId(UUID.randomUUID().toString());
		customerDTO2.setNombre("OE");
		
		customers.add(customerDTO);
		customers.add(customerDTO2);
	}
	
	public List<CustomerDTO> getCustomers() {
		return customers;
	}
}
