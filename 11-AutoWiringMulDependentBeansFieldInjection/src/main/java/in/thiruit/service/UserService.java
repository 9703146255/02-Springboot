package in.thiruit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import in.thiruit.dao.IUserDao;
import in.thiruit.utility.PasswordEncryption;
import in.thiruit.utility.SendEmail;

@Component
public class UserService {

	
	@Autowired
	private IUserDao userDao;
	
	
	@Autowired
	private PasswordEncryption passwordEncryption;

	@Autowired
	private SendEmail sendEmail;
	
//Setter injection
//	@Autowired
//	public void setUserDao(IUserDao userDao) 
//	{
//		this.userDao = userDao;
//	}
//
//	
//	@Autowired
//	public void setPasswordEncryption(PasswordEncryption passwordEncryption) 
//	{
//		this.passwordEncryption = passwordEncryption;
//	}
//
//	
//	@Autowired
//	public void setSendEmail(SendEmail sendEmail) 
//	{
//		this.sendEmail = sendEmail;
//	}

	
//===============================================================================	
	
//	//if we dont have 0-param constructor @Autowired optional
//	
//	
//	public UserService(IUserDao userDao, PasswordEncryption passwordEncryption, SendEmail sendEmail) {
//		super();
//		this.userDao = userDao;
//		this.passwordEncryption = passwordEncryption;
//		this.sendEmail = sendEmail;
//	}
//	
	
	//===============================================================================	
	
	
	
	//if we have both 1)parameteraised constructor and 2)0-param constructor then @Auitowired is mandatory we need mention otherwise we will get exception
	
//	@Autowired
//	public UserService(IUserDao userDao, PasswordEncryption passwordEncryption, SendEmail sendEmail) {
//		super();
//		this.userDao = userDao;
//		this.passwordEncryption = passwordEncryption;
//		this.sendEmail = sendEmail;
//	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public UserService() 
	{
		System.out.println("UserService:: 0-PARAM CONSTRUCTOR");
	}
	
	
	
	public void userRegistration(String name, String email, String pswrd) 
	{

		// insert data into table

		boolean isSaveUser = userDao.saveUser(name, email, pswrd);
		if (isSaveUser) {
			System.out.println("Registration successfull");

			boolean isEncrypted = passwordEncryption.getPasswordEncryption(pswrd);

			// encrypt the password
			if (isEncrypted) {
				System.out.println("password encrypted");
			} else {
				System.out.println("password not encrypted..");
			}

		} else {
			System.out.println("Registration failed");
		}

		// Send email to the user

		sendEmail.sendEmailToUser(name, email, pswrd);

	}



	
}
