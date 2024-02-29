package com.example.yggdrasil;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class YggdrasilApplication {

	public static void main(String[] args) {
		SpringApplication.run(YggdrasilApplication.class, args);
	}


}
