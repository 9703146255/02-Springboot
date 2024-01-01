package in.thiru.bean;

import org.springframework.context.annotation.Bean;

//in.thiru.bean.MyBean
public class MyBean 
{

	 private String property1;

	    public void setProperty1(String property1) {
	        this.property1 = property1;
	    }

	    public void init() {
	        System.out.println("Initializing MyBean. Property1: " + property1);
	    }
	    
	    @Bean
	    private boolean logic() 
	    {
		System.out.println("bank logic......");
		
		return true;
		}

	    public void cleanup() {
	        System.out.println("Destroying MyBean");
	    }
	
	
}
