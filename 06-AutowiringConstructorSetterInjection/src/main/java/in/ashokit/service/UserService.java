package in.ashokit.service;

//when we have two injection than it will perform Constructor injection  1st and than perform setter injection
//setter injection will override the constructor injecton
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import in.ashokit.dao.IUserDao;

@Component
public class UserService {

	public UserService() {
		System.out.println(" UserService :: Constructor ");
	}

	private IUserDao dao;

	@Autowired
	public void setDao(IUserDao dao) {

		System.out.println("Setter method got executed....." + dao.getClass().getName());

		this.dao = dao;
	}

	@Autowired
	public UserService(IUserDao dao) {

		System.out.println("Constructor got executed....." + dao.getClass().getName());

		this.dao = dao;
	}

	public void getName(Integer id) {
		String name = dao.findNameById(id);

		System.out.println("Name of the user is :: " + name);
	}

}
