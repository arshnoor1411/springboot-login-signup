package com.example.springboot_login_signup;

import org.springframework.boot.SpringApplication;

public class TestSpringbootLoginSignupApplication {

	public static void main(String[] args) {
		SpringApplication.from(SpringbootLoginSignupApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
