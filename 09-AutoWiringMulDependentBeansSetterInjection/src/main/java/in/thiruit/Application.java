package in.thiruit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.thiruit.service.UserService;


@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(Application.class, args);
	
		UserService bean = run.getBean(UserService.class);
		
		
		bean.userRegistration("THIRUMALESH", "FINDMETHIRU@GMAIL.COM", "THIRU@123");
	
		//name, email, password
	
	}

}
