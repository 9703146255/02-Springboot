package in.thiru.dao;

import org.springframework.stereotype.Component;

@Component
public class UserDaoImpl implements IUserDao{

	
	public UserDaoImpl() {
		System.out.println("UserDaoImpl :: Constructor :");
	}
	
	
	
	
	@Override
	public String findNameById(Integer id) {


		if(id==100)
		{
			return "i am 100";
		}
		else if(id==200)
		{
			return "i am 200";
		}
		else if(id==300)
		{
			return "i am 300";
		}
		
		
		
		
		
		
		
		return null;
	}

}
