package in.thiru.dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("oracle")
public class OraclDaoImpl implements IUserDao

{
	
	public OraclDaoImpl() {
		System.out.println("OraclDaoImpl :: constructor");
	}

	@Override
	public String findNameById(Integer id) 
	{
		
		if(id==1001)
		{
			return "connection-1";
		}
		else if(id==1002)
		{
			return "connection-2";
		}
		else if(id==1003)
		{
			return "connection-3";
		}
		else if(id==1004)
		{
			return "connection-4";
		}
		else if(id==1005)
		{
			return "connection-5";
		}
		else if(id==1006)
		{
			return "connection-6";
		}
		else if(id==1007)
		{
			return "connection-7";
		}
		
		
		
		
		
		
		
		return "Connection are exousted";
	}
	
}
