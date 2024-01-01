package in.thiru.dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("mysql")
public class MySqlImpl implements UserDao{

	
	
	@Override
	public String findNameById(Integer id) {
		
		
		if(id==100)
		{
			return "thiru";
		}
		else if(id==200){
			return "kiran";
		}
		
		
		return null;
	}

}
