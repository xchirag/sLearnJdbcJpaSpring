import com.fdmgroup.service.CustomerService;
import com.fdmgroup.service.CustomerServiceImpl;

public class Application {

	public static void main(String[] args) {
		
		
		CustomerService service = new CustomerServiceImpl();
		
		System.out.println(service.findAll().get(0).getFirstname());
	}

}


//spring is all about removing hard coded things and removinig configuration
//this model is completely different with the use of spring framework but will provide the same functionalities
//spring_sample_1 is the project which was followed and created up to architecture and project setup demo as under
//https://app.pluralsight.com/player?course=spring-fundamentals&author=bryan-hansen&name=spring-m2-architecture&clip=9&mode=live