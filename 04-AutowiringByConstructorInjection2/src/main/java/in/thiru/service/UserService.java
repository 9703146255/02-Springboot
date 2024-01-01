package in.thiru.service;

import org.springframework.stereotype.Component;

import in.thiru.dao.IUserDao;

@Component
public class UserService 
{
	private IUserDao dao;

	
	//if we write only parameterized constructor, jvm don't have another chance to create object then JVM CREATE object for parameteraized constructor
	public UserService(IUserDao dao)
	{
		System.out.println("UserService :: parameterized-Constructor ");
		this.dao=dao;
	}
	
	public void printNameById(Integer id)
	{
		String name = dao.findNameById(id);
		System.out.println("name of the user is :: "+name);
		
	}
	
	
	
}
