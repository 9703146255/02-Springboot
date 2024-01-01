package in.thiruit.utility;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

//@Component
@Configuration //we can use
public class PasswordEncryption {

	public boolean getPasswordEncryption(String pwd) {

		System.out.println("getPasswordEncryption(String pwd)");

		return true;
	}

}
