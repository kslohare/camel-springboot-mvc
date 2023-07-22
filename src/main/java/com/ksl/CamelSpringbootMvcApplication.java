package com.ksl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CamelSpringbootMvcApplication {

	public static void main(String[] args) {
		System.setProperty("server.servlet.context-path","/rest-camel");
		SpringApplication.run(CamelSpringbootMvcApplication.class, args);
	}

}
