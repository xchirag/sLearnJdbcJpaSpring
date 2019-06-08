package com.fdmgroup.service;

import java.util.List;

import com.fdmgroup.model.Customer;
import com.fdmgroup.repository.CustomerRepository;

public class CustomerServiceImpl implements CustomerService {

	//private CustomerRepository customerRepository = new HibernateCustomerRepositoryImpl();

	private CustomerRepository customerRepository;
	
	//because we are going for bean setter injection
	// here the bean will replace the NEW keyword line of above
	
	public CustomerServiceImpl(){
		
	}
	
	public CustomerServiceImpl(CustomerRepository customerRepository) {
		//super();
		this.customerRepository = customerRepository;
	}

	@Override
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}

	public void setCustomerRepository(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}
}
