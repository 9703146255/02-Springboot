package in.thiru.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import in.thiru.dao.IUserDao;


@Component
public class UserService
{

//	@Qualifier("oracle")
//	@Autowired
	private IUserDao dao;
	
	
	
//// for constructor we will use inside the constructor @Qualifier("oracle") 
	public UserService(@Qualifier("oracle") IUserDao dao) 
	{
		
		System.out.println("UserService :: Constructor");
		this.dao=dao;
	}
	
	
	
	
	
//	public UserService() 
//	{
//		System.out.println("UserService :: Constructor");
//	}
//	
	public void getNameById(Integer id)
	{
		String name = dao.findNameById(id);
		
		System.out.println("@Qualifier(in target class and impl classes having @component(/oracle/) and  @component(/mysql/) using these class :: "+dao.getClass().getName());
		System.out.println(name);
	}
	
	
	
	
}
