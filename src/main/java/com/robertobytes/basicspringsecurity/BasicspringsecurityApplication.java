package com.robertobytes.basicspringsecurity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
// optional when using classes with parent package
// If the class is located within the same package as the SpringBoot Main class, this can be omitted
// 		If using classes outside the scope of the package, include the @ComponentScan Directive
@ComponentScan("com.robertobytes.basicspringsecurity.controller")
public class BasicspringsecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(BasicspringsecurityApplication.class, args);
	}

}
