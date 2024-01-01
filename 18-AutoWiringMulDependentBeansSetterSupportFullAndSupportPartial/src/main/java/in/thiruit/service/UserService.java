package in.thiruit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import in.thiruit.dao.IUserDao;
import in.thiruit.utility.PasswordEncryption;
import in.thiruit.utility.SendEmail;

/*

 SI
 ==
 
 ==> When ever perform the setter injection TARGET BEAN OBJECT WILL BE CREATE FIRSTS And DEPENDENT CLASS WILL BE CREATE
 
 ==> When we use setter injection Its perform partial injection also
 
	Note:: when we use setter injection it perform the Partail injection 
 
 
 
 
 Records inserted succesfully.......
Registration successfull
password encrypter ......
password encrypted
Exception in thread "main" java.lang.NullPointerException: Cannot invoke "in.thiruit.utility.SendEmail.sendEmailToUser(String, String, String)" because "this.sendEmail" is null
	at in.thiruit.service.UserService.userRegistration(UserService.java:64)
	at in.thiruit.Application.main(Application.java:18)
	

 */
@Component
public class UserService {

	private IUserDao userDao;

	private PasswordEncryption passwordEncryption;

	private SendEmail sendEmail;
	
	
	@Autowired
	public void setUserDao(IUserDao userDao) 
	{
		this.userDao = userDao;
	}

	
	//@Autowired
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
