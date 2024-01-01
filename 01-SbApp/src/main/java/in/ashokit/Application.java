package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/*
to  check how many classes loaded into JVM we will check run.getBeanDefinitionCount() method
 */
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(Application.class, args);
		System.out.println(run.getClass().getName());
		System.out.println("total number of classes is loading in my spring boot app :	"+run.getBeanDefinitionCount());
		System.out.println("total number of classes is loading in my spring boot app :	"+run.getApplicationName());
		System.out.println("total number of classes is loading in my spring boot app :	"+run.getDisplayName());
		System.out.println("total number of classes is loading in my spring boot app :	"+run.getStartupDate());
		
		
		
		System.out.println("total number of classes is loading in my spring boot app :	"+run.getClass());
		System.out.println("total number of classes is loading in my spring boot app :	"+run.getClassLoader());
		System.out.println("total number of classes is loading in my spring boot app :	"+run.getBeanFactory());
		System.out.println("total number of classes is loading in my spring boot app :	"+run.getStartupDate());
		System.out.println(run.getBeanDefinitionNames().getClass().getName());
		
		
	}

}
