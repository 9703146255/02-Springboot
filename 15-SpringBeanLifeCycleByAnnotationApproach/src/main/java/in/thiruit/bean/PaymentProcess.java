package in.thiruit.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;


@Component
@Configuration
public class PaymentProcess 
{

	@PostConstruct
	private void init()
	{
		System.out.println("Payment processings......");
	}
	
	@Bean
	public SecurityConfig paymentMethod()
	{
		SecurityConfig sc=new SecurityConfig();
		
		System.out.println("your payment success....");
		
		return sc;
	}
	
	
	@PreDestroy
	public void destroy()
	{
		System.out.println("payment ended by ioc container....");
	}
	
	
}
