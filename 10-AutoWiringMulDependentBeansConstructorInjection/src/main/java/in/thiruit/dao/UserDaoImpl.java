package in.thiruit.dao;

import org.springframework.stereotype.Component;

@Component
public class UserDaoImpl implements IUserDao {

	@Override
	public boolean saveUser(String userName, String userEmail, String userPwd) {

		System.out.println("Records inserted succesfully.......");

		return true;
	}

}
