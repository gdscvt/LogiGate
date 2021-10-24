package com.logigate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LogigateApplication {

	public static void main(String[] args) {
		SpringApplication.run(LogigateApplication.class, args);
		// SpringApplication.run(LogigateApplication::class.java, *args);
	}

}
