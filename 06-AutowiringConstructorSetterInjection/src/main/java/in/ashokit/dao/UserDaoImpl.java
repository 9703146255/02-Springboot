package in.ashokit.dao;

import org.springframework.stereotype.Component;

@Component
public class UserDaoImpl implements IUserDao
{
	
	public UserDaoImpl() 
	{
		System.out.println("UserDaoImpl :: Constructor");
	}
	
	@Override
	public String findNameById(Integer id) {
	
		
		if(id==100)
		{
			return "thiru";
		}
		else if(id==200)
		{
			return "guru";
		}
		
		return null;
	}

}
