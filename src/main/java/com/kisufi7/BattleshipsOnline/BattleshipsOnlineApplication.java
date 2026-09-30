package com.kisufi7.BattleshipsOnline;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.persistence.autoconfigure.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
/*
Source - https://stackoverflow.com/a/37650002
Posted by Sumeet Tiwari
Retrieved 2026-09-30, License - CC BY-SA 3.0
*/

@EntityScan(basePackages ="com/kisufi7/BattleshipsOnline")
@EnableJpaRepositories(basePackages = "com.kisufi7.BattleshipsOnline.repository")

public class BattleshipsOnlineApplication {

	public static void main(String[] args) {
		SpringApplication.run(BattleshipsOnlineApplication.class, args);
	}

}

