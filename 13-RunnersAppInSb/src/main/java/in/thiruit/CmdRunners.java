package in.thiruit;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/*
 CommandLineRunner :: run(String... args)
 ApplicationRunner :: run(ApplicationArguments args)
 */
@Component
public class CmdRunners implements CommandLineRunner{

	@Override
	public void run(String... args) throws Exception 
	{

		System.out.println("CommandLineRunner is started at the end of the run method.. by IOC container..");
	}

}
