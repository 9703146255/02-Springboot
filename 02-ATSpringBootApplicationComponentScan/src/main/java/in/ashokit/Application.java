package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import in.ashokit.securitycon.AppSecurity;

/*
 package names with classes
====================
//com.tcs.ReportService
//com.tcs.UserService

//in.ashokit.Application
////in.ashokit.ReportDAO
//in.ashokit.UserDAO

//in.ashokit.security.AppSecurity

//in.ashokit.util.PwdUtil

//win.thiru.ReportController
//win.thiru.ServiceController

 */
//in.ashokit.Application
@SpringBootApplication
@ComponentScan(basePackages = {"in.ashokit","com.tcs","win.thiru"})
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(Application.class, args);
		
		//ReportDAO bean = run.getBean(ReportDAO.class);
		
		//prototype when we call getBean method at the time only its create object called lazy loading
		System.out.println("no of beans loaded is :: " +run.getBeanDefinitionCount());
		ReportDAO bean1 = run.getBean(ReportDAO.class);
		ReportDAO bean2 = run.getBean(ReportDAO.class);
		ReportDAO bean3 = run.getBean(ReportDAO.class);
		
		
		System.out.println("scope is prototype");
		System.out.println(bean1.hashCode());
		System.out.println(bean2.hashCode());
		System.out.println(bean3.hashCode());
		
		UserDAO bean = run.getBean(UserDAO.class);
		UserDAO bean4 = run.getBean(UserDAO.class);
		UserDAO bean5 = run.getBean(UserDAO.class);
		
		System.out.println();
		System.out.println();
		System.out.println("scope is singletone by default");
		System.out.println(bean.hashCode());
		System.out.println(bean4.hashCode());
		System.out.println(bean5.hashCode());
		
	}
	
	
	@Bean
	public AppSecurity getConfigurationObj()
	{
	  AppSecurity security=new AppSecurity();
				
	   return security;
	}
	

}
