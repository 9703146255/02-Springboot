package in.ashokit.securitycon;


//in.ashokit.security.AppSecurity
//@Component
/*
If we want to customaize the object creation than we need to use inside @Configuration class we need to

create @Bean annotation method level than it will customaize the object creation

 
NOTE :: MAIN CLASS ALSO HAVE @SpringBootConfiguration[so these is also configuration class]
        If we want to use configuration class we need to use @Configuration at class level
 *
 */
public class AppSecurity 
{

	public AppSecurity() 
	{
		
		System.out.println("AppSecurity :: Constructor...");
	}
	
	
}
