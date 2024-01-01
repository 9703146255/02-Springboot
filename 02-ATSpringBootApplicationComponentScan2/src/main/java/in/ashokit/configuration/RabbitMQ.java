package in.ashokit.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQ {

	public RabbitMQ() {
		System.out.println("RabbitMQ() :: Constructor");
	}

	@Bean
	RabbitMQ getRabbitMQObject() {
		System.out.println("getRabbitMQObject() :: method ");
		RabbitMQ rmq = new RabbitMQ();

		return rmq;
	}

}
