package in.thiruit;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/*
CommandLineRunner :: run(String... args)
ApplicationRunner :: run(ApplicationArguments args)
*/
@Component
public class ApplicationRunnersClass implements ApplicationRunner{

	@Override
	public void run(ApplicationArguments args) throws Exception
	{
		System.out.println("ApplicationRunner is started IOC container at the end of the run() method By IOC container..");
	}

}
