package in.thiru;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.thiru.bean.MyBean;

public class MainApp 
{


	
	public static void main(String[] args) {
		 // Load the Spring container
	    try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-beans.xml")) 
	    {

	        // Retrieve the bean from the container
	        MyBean myBean = (MyBean) context.getBean("myBean");

	        // The init() method will be called during bean initialization
	        // The cleanup() method will be called during bean destruction when the context is closed

	        // No further action needed; the Spring container will manage the bean's life cycle

	    }
	    catch (Exception e)
	    {
	        e.printStackTrace();
	    }
	}
	
	
}
