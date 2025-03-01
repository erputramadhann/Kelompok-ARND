package com.itdp.arnd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class ArndApplication {

	public static void main(String[] args) {
		SpringApplication.run(ArndApplication.class, args);
	}

}
