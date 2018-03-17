package com.reactnative.tinder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.rest.RepositoryRestMvcAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class, RepositoryRestMvcAutoConfiguration.class })
@ComponentScan(basePackages = {"com.reactnative.controller", "com.reactnative.tinder", "com.reactnative.service"})
public class TinderApplication {
	public static void main(String[] args) {
		SpringApplication.run(TinderApplication.class, args);
	}
}
