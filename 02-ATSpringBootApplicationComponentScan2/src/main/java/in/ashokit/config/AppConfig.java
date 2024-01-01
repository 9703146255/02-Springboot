package in.ashokit.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.ashokit.configuration.DataSource;
import in.ashokit.configuration.Kafka;
import in.ashokit.configuration.Redis;
import in.ashokit.configuration.Swagger;
import in.ashokit.security.AppSecurity;

@Configuration
public class AppConfig {

	public AppConfig() {
		System.out.println("AppConfig :: Constructor...");
	}

    @Bean
    AppSecurity getConfigurationObj() {
		AppSecurity securityObj = new AppSecurity();
		System.out.println(" getConfigurationObj() ");

		return securityObj;
	}

    @Bean
    Kafka getKafkaConigObj() {

		Kafka kafkaObj = new Kafka();
		System.out.println(" getKafkaConigObj() ");

		return kafkaObj;

	}

    @Bean
    DataSource getDataSourceObj() {

		DataSource dsObj = new DataSource();
		System.out.println(" getDataSourceObj() ");

		return dsObj;

	}

    @Bean
    Redis getRediObj() {

		Redis rdObj=new Redis();
		
		System.out.println(" getRediObj() ");
		 return rdObj;

	}

    @Bean
    Swagger getSwaggerObj()
	{
		Swagger swObj=new Swagger();
		
		System.out.println(" getSwaggerObj() ");
		
		return swObj;
	}
	
	
	

}
