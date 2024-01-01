package in.thiru.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import in.thiru.dao.IUserDao;


@Component
public class UserService
{

	@Autowired
	private IUserDao dao;  //it will follow the reflection Api[opposition of oops principles]
	
	public UserService() 
	{
		System.out.println("UserService :: Constructor ");
	}
	
	
	
	public void getNameById(Integer id)
	{
		String name = dao.findNameById(id);
		System.out.println("name of the user is ::"+name);
	}
	
	
}
