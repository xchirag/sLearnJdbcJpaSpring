package com.fdmgroup.repository;

import java.util.ArrayList;
import java.util.List;

import com.fdmgroup.model.Customer;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {
	
	/* (non-Javadoc)
	 * @see com.fdmgroup.repository.CustomerRepository#findAll()
	 */
	@Override
	public List<Customer> findAll (){
		List<Customer> customers = new ArrayList<>();
		
		Customer customer = new Customer();
		
		customer.setFirstname("Vic");
		customer.setLastname("Pojo");
		
		customers.add(customer);
		return customers;
	}

}
