package in.thiruit.utility;

import org.springframework.stereotype.Component;

//@Component
public class SendEmail {

	public boolean sendEmailToUser(String to, String subject, String body) {

		System.out.println("email send to user successfully");

		return true;
	}

}
