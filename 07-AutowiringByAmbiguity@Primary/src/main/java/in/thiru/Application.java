package in.thiru;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.thiru.service.UserService;
/*
 	==>if we use @Primary in both OracleImpl class and MySqlImp class  
 	
 	==>	than also we will get ambiguty proble than we need to use 
 	
 	==> @Primary annotation we need to use only one impl class otherwise we will get ambiguity problem
 
 
 
 
 
 
 
 
 
 
 */


@SpringBootApplication
public class Application {

	public static void main(String[] args)
	{
		ConfigurableApplicationContext run = SpringApplication.run(Application.class, args);
		
		
	
		UserService bean1 = run.getBean(UserService.class);
		UserService bean2 = run.getBean(UserService.class);
		UserService bean4 = run.getBean(UserService.class);
		UserService bean5 = run.getBean(UserService.class);
		bean1.getNameById(1001);
		
		
		bean1.getNameById(1001);
		bean1.getNameById(1002);
		bean1.getNameById(1003);
		bean1.getNameById(1004);
		bean1.getNameById(1005);
		
		
	}

}
