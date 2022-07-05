package com.sec4dev.unsecure;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UnsecureSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(UnsecureSpringBootApplication.class, args);
		System.out.println("Here I am! Up and running!");
	}

}
