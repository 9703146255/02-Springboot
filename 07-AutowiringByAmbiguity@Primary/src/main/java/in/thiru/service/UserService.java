package in.thiru.service;

import org.springframework.stereotype.Component;

import in.thiru.dao.IUserDao;

@Component
public class UserService {

	private IUserDao dao;

	public UserService(IUserDao dao) {

		System.out.println("UserService :: Constructor");
		this.dao = dao;
	}

//	public UserService() 
//	{
//		System.out.println("UserService :: Constructor");
//	}
//	
	public void getNameById(Integer id) {
		String name = dao.findNameById(id);

		System.out.println("@Primary using these class :: " + dao.getClass().getName());
		System.out.println(name);
	}

}
