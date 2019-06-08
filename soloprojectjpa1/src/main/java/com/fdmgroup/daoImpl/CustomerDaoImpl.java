package com.fdmgroup.daoImpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.fdmgroup.Dao.CustomerDao;
import com.fdmgroup.entity.Customer;

public class CustomerDaoImpl implements CustomerDao {
	
	private EntityManagerFactory entityManagerFactory;
	private EntityManager entityManager;
	private EntityTransaction transaction;
	
	
	public void setupEnvironment(){
		
		entityManagerFactory = Persistence.createEntityManagerFactory("soloprojectjpa1");
		entityManager = entityManagerFactory.createEntityManager();
		transaction = entityManager.getTransaction();
	}

	@Override
	public void addCustomer(Customer customer) {

//		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jdbcProject3");
//		EntityManager entityManager = entityManagerFactory.createEntityManager();
//		EntityTransaction transaction = entityManager.getTransaction();
		setupEnvironment();
		Customer tempCustomer = entityManager.find(Customer.class, customer.getCustomerNumber());

		if (tempCustomer == null) {
			transaction.begin();
			entityManager.merge(customer);
			transaction.commit();
		}
	}

	@Override
	public Customer getCustomer(int CustomerNumber) {

//		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jdbcProject3");
//		EntityManager entityManager = entityManagerFactory.createEntityManager();
//		EntityTransaction transaction = entityManager.getTransaction();
		setupEnvironment();
		Customer customer = entityManager.find(Customer.class, CustomerNumber);
		return customer;
	}

	@Override
	public void removeCustomer(int customerId) {
		
//		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jdbcProject3");
//		EntityManager entityManager = entityManagerFactory.createEntityManager();
//		EntityTransaction transaction = entityManager.getTransaction();
		setupEnvironment();
		Customer customer = entityManager.find(Customer.class, customerId);
		if (customer != null) {
			transaction.begin();
			entityManager.remove(customer);
			transaction.commit();
		}
	}

	@Override
	public void updateCustomer(Customer customer) {
	
//		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jdbcProject3");
//		EntityManager entityManager = entityManagerFactory.createEntityManager();
//		EntityTransaction transaction = entityManager.getTransaction();
		setupEnvironment();
		int customerNumber = customer.getCustomerNumber();
		Customer tempCustomer = entityManager.find(Customer.class, customerNumber);
		
		if(tempCustomer != null){
			transaction.begin();
			entityManager.merge(customer);
			transaction.commit();
		}
	}

	@Override
	public List<Customer> listOfCustomers() {

//		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jdbcProject3");
//		EntityManager entityManager = entityManagerFactory.createEntityManager();
//		EntityTransaction transaction = entityManager.getTransaction();
		setupEnvironment();
		List<Customer> resultList = entityManager.createQuery("Select a From ng_customer a", Customer.class)
				.getResultList();
		return resultList;

	}

}
