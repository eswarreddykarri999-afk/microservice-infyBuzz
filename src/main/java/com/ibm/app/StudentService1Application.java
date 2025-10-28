package com.ibm.app;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
@ComponentScan({"com.ibm.controller", "com.ibm.service"})
@EntityScan("com.ibm.entity")
@EnableJpaRepositories("com.ibm.repository")

public class StudentService1Application {

    @Value("${address.service.url}")
    private String addressServiceUrl;

    public static void main(String[] args) {
        SpringApplication.run(StudentService1Application.class, args);
    }


    @Bean
    public WebClient webClient () {
        WebClient webClient =WebClient.builder()
                .baseUrl(addressServiceUrl).build();

        return webClient;
    }

}
