package in.thiruit.beans;

import javax.security.auth.DestroyFailedException;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class Car implements InitializingBean,DisposableBean
{

	
	@Override
	public void afterPropertiesSet() throws Exception {
			System.out.println("car started when we call afterPropertiesSet()");
	}
	
	
	
	public void drive() 
	{
		System.out.println("car driving started....");
	}

	
	
	
	@Override
	public void destroy() throws DestroyFailedException {
		
		System.out.println("Car stoped when we call destroy() method");
	
	
	}
}
