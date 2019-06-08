package com.fdmgroup.repository;

import java.util.List;

import com.fdmgroup.model.Customer;

public interface CustomerRepository {

	List<Customer> findAll();

}