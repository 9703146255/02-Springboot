package in.thiru.service;

import org.springframework.stereotype.Component;

import in.thiru.dao.IUserDao;


/*
 
 
 ==>	without using annotation also it will perform the dependency injection here 
 
 ==>	when we have only one parameterized constructor
 
 ==>	When we have two  constructor IOC get to interact with 0-PARAM constructor
 
 ==>	When we have only one parameterized constructor then @Autowired is optional
 
 
public UserService(){}
public UserService(UserDao dao){this.dao=dao;}
 */
@Component
public class UserService 
{
	private IUserDao dao;

	public UserService()
	{
		System.out.println("UserService :: 0-Param Constructor ");
	}
	
	
	public UserService(IUserDao dao)
	{
		System.out.println("UserService :: Param Constructor ");
	
	}
	

	public void printNameById(Integer id)
	{
		String name = dao.findNameById(id);
		System.out.println("name of the user is :: "+name);
		
	}
	
	
	
}
