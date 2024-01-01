package in.thiru.service;

import org.springframework.stereotype.Component;

import in.thiru.dao.UserDao;

@Component
public class UserService 
{
	private UserDao dao;

	public UserService() {
		System.out.println("UserService :: 0-Parameteraized Constructor ");
	}
	
	public UserService(UserDao dao)
	{
		System.out.println("UserService :: Parameteraized Constructor ");
		this.dao=dao;
	}
	
	public void printNameById(Integer id)
	{
		String name = dao.findNameById(id);
		System.out.println("name of the user is :: "+name);
		
	}
	
	
	
}
