package com.example.jwt_security_example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;

@SpringBootApplication
@EnableMethodSecurity(jsr250Enabled = true,prePostEnabled = true,securedEnabled = true)
public class JwtSecurityExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(JwtSecurityExampleApplication.class, args);
	}

}
