package in.thiruit.service;

import org.springframework.stereotype.Component;

import in.thiruit.dao.IUserDao;
import in.thiruit.utility.PasswordEncryption;
import in.thiruit.utility.SendEmail;


/*
CI : Dependent bean object will create first and it will inject target bean object
Note: if One Dependent bean object will not created then it will not inject into target object
	
	==>	When we should go to CI:
	===========================
	
	==> Programmer don't want to use partial injection,
	
	==> programmer want full injection than we should go to CI.
	
	
	Note:: i keep inside passwordEncryption //@Component and SendEmails also //@Component
 */


@Component
public class UserService {

	private IUserDao userDao;

	private PasswordEncryption passwordEncryption;

	private SendEmail sendEmail;
	
	
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

	
	
	public UserService(IUserDao userDao, PasswordEncryption passwordEncryption, SendEmail sendEmail) {
		
		this.userDao = userDao;
		this.passwordEncryption = passwordEncryption;
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
