
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.fdmgroup.repository.CustomerRepository;
import com.fdmgroup.repository.HibernateCustomerRepositoryImpl;
import com.fdmgroup.service.CustomerService;
import com.fdmgroup.service.CustomerServiceImpl;

//this is a simple java class file

@Configuration
public class AppConfig {

	@Bean(name = "customerService") // follow bean naming convention for
									// auto-wiring
	public CustomerService getCustomerService() {
		
		CustomerServiceImpl customerServiceImpl = 
				new CustomerServiceImpl(getHibernateCustomerRepoImpl());
		
		return customerServiceImpl;
		
		// this is setter injection
		// CustomerServiceImpl service = new CustomerServiceImpl();
		//service.setCustomerRepository(getHibernateCustomerRepoImpl());
		//return service;
	}

	@Bean(name = "customerRepository") // follow naming
	public CustomerRepository getHibernateCustomerRepoImpl() {
		return new HibernateCustomerRepositoryImpl();
	}
}
