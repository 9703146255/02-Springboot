package in.ashokit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import in.ashokit.dao.IUserDao;

@Component
public class UserService {

	public UserService() {
		System.out.println(" UserService :: Constructor ");
	}

	private IUserDao dao;

	// performing setter injection
	@Autowired
	public void setDao(IUserDao dao) {

		System.out.println("Setter method got executed.....");

		this.dao = dao;
	}

	public void getName(Integer id) {
		String name = dao.findNameById(id);

		System.out.println("Name of the user is :: " + name);
	}

}
