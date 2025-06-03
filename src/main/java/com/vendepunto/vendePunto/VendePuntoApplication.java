package com.vendepunto.vendePunto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.vendepunto.controller", "com.vendepunto.vendePunto"})
public class VendePuntoApplication {

	public static void main(String[] args) {
		SpringApplication.run(VendePuntoApplication.class, args);
	}

}
