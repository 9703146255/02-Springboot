package in.thiruit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import in.thiruit.dao.IUserDao;
import in.thiruit.utility.PasswordEncryption;
import in.thiruit.utility.SendEmail;

@Service
public class UserService {

	private IUserDao userDao;

	private PasswordEncryption passwordEncryption;

	private SendEmail sendEmail;
	
	
	@Autowired
	public void setUserDao(IUserDao userDao) 
	{
		this.userDao = userDao;
	}

	
	@Autowired
	public void setPasswordEncryption(PasswordEncryption passwordEncryption) 
	{
		this.passwordEncryption = passwordEncryption;
	}

	
	//@Autowired
	public void setSendEmail(SendEmail sendEmail) 
	{
		this.sendEmail = sendEmail;
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
