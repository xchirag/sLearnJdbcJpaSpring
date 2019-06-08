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
				
				//notice that after beans/wiring we do not require andy new statement creating objects
				//just getting service from customer services!
	}

}


//spring is all about removing hard coded things and removinig configuration
//this model is completely different with the use of spring framework but will provide the same functionalities
//spring_sample_1 is the project which was followed and created up to architecture and project setup demo as under
//https://app.pluralsight.com/player?course=spring-fundamentals&author=bryan-hansen&name=spring-m2-architecture&clip=9&mode=live