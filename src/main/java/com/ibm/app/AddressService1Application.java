package com.ibm.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"com.ibm.controller", "com.ibm.service"})
@EntityScan("com.ibm.entity")
@EnableJpaRepositories("com.ibm.repository")
public class AddressService1Application {

	public static void main(String[] args) {
		SpringApplication.run(AddressService1Application.class, args);
	}

}
