package com.example.springboot_login_signup;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@Import(TestcontainersConfiguration.class)
@SpringBootTest
class SpringbootLoginSignupApplicationTests {

	@Test
	void contextLoads() {
	}

}
