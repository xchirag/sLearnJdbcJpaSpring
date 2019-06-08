import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.fdmgroup.service.CustomerService;
import com.fdmgroup.service.CustomerServiceImpl;

public class Application {

	public static void main(String[] args) {
		
		
		//CustomerService service = new CustomerServiceImpl();
		//where to find applicationContext.xml file 
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		//CustomerService service = applicationContext.getBean("customerService", CustomerService.class);
		
		//getting bean of class which was dependent of another initially, in our case CustomerService.class!
		CustomerService service = applicationContext.getBean("customerService", CustomerService.class);
		System.out.println(service.findAll().get(0).getFirstname());
	}

}


//spring is all about removing hard coded things and removinig configuration
//this model is completely different with the use of spring framework but will provide the same functionalities
//how the code is written making is difficult to test

// pain points of spring_sample_1 are as under which motivates to go ahead and use 
//spring framework
// we created interfaces but then again hardcoded them into that!

//spring would be via maven only

// use maven to download spring depen

// http://www.springboottutorial.com/spring-boot-vs-spring-mvc-vs-spring
//https://projects.spring.io/spring-framework/ find out latest dependencies!

// xml 

// firstly introduced
// simpler
// separation of concerns




