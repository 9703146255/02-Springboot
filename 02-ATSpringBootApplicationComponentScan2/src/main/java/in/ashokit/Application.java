package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import in.ashokit.security.AppSecurity;

/*
 Here added config page
 
 
 @Configuration : is present inside main class called main class of spring boot
 
 Note :: if we want to customize the object creation we can use @Bean along with @Configuration
 
 In a give @Confifuration we can use any number of @Bean classes in the project
 
 
 */


@SpringBootApplication
@ComponentScan(basePackages = {"in.ashokit","com.tcs","win.thiru"})
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(Application.class, args);
		
		//ReportDAO bean = run.getBean(ReportDAO.class);
		
		System.out.println("no of beans loaded is :: " +run.getBeanDefinitionCount());
		
		
	}
	
	
	
	

}
