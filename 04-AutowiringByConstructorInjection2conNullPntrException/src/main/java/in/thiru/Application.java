package in.thiru;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.thiru.service.UserService;



/*
 Constructor injection
 =====================
 method-1 :  if use 0-param & arg-param it will by default take ::  0-param 
 
 		==>		0-param  :: it will not initailaize the values so we will get NullPointerException
 		==>		
 
 */
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(Application.class, args);
		
		
		UserService bean = run.getBean(UserService.class);
		bean.printNameById(100);
		
		
		
	}

}
