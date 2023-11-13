package com.rangavdhoot.microservice.springclouldconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class SpringClouldConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringClouldConfigServerApplication.class, args);
	}

}
