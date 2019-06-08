package com.fdmgroup.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fdmgroup.model.Customer;
import com.fdmgroup.repository.CustomerRepository;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

	//this is member variable level injections which do not require setter at all
	//@Autowired
	private CustomerRepository customerRepository;// = new HibernateCustomerRepositoryImpl();

	//this is setter method level injection
	//@Autowired
	public void setCustomerRepository(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

	
	// this is constructor autowired!
	@Autowired
	public CustomerServiceImpl(CustomerRepository customerRepository) {
		System.out.println("using constructor injection");
		this.customerRepository = customerRepository;
	}




	@Override
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}
}
