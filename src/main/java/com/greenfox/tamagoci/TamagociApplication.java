package com.greenfox.tamagoci;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class TamagociApplication {

	public static void main(String[] args) {
		SpringApplication.run(TamagociApplication.class, args);
	}
}
