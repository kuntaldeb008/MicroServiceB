package com.example.microserviceb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class MicroservicebApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicebApplication.class, args);
	}

	/*
	 * to fix restTemplate null issue  in Microservice B while running it create a RestTemplate bean in your MicroserviceBApplication class 
	 * and inject it into MicroserviceAService using @Autowired
	 */
	 @Bean
	 public RestTemplate restTemplate(RestTemplateBuilder builder) {
	        return builder.build();                                 
	}
}
