/*
 * Copyright BigCorp. All rights reserved.
 * See the BigCorp license agreement in the root directory of this project.
 */

package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Entry point for the application
 */
@SpringBootApplication
// BigCorp custom @Enable annotations here
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
