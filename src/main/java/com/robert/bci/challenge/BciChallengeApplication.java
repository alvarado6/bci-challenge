package com.robert.bci.challenge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class BciChallengeApplication {

	public static void main(String[] args) {
		SpringApplication.run(BciChallengeApplication.class, args);
	}

}
