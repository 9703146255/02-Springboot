package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.service.UserService;


/*
 We are performing setter injection here
 @Autowired 
 setterMethod(UserDao dao){this.dao=dao}
 */
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(Application.class, args);
		
		UserService bean1 = run.getBean(UserService.class);
		UserService bean2 = run.getBean(UserService.class);
		
		System.out.println(bean1.hashCode());
		System.out.println(bean2.hashCode());
		System.out.println("==============================");
		
		bean1.getName(200);
		
		
		
	}
	
	
	
	
	
	
	
	
	

}
