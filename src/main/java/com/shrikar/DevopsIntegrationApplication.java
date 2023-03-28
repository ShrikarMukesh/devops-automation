package com.shrikar;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
@OpenAPIDefinition(
		info = @Info(
				title = "Hello World Project",
				version="1.0.0",
				description = "This project is only for learinging",
				termsOfService = "ShrikarMukesh",
				contact = @Contact(name = "Shrikar", email = "shrikar@gmail.com")
		)
)
public class DevopsIntegrationApplication {
	public static void main(String[] args) {
		SpringApplication.run(DevopsIntegrationApplication.class, args);
	}
}
