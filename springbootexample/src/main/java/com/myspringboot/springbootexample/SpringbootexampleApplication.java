package com.myspringboot.springbootexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.myspringboot.entities.User;
import com.myspringboot.repository.UserRepo;

@SpringBootApplication
public class SpringbootexampleApplication {

	public static void main(String[] args) {
		
		ApplicationContext context = SpringApplication.run(SpringbootexampleApplication.class, args);
		
	}

}
