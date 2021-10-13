package com.example.almighty.java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class AlmightyJavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(AlmightyJavaApplication.class, args);
	}

}
