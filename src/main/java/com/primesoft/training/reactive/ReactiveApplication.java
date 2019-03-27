package com.primesoft.training.reactive;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.reactive.config.EnableWebFlux;

@SpringBootApplication
public class ReactiveApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReactiveApplication.class, args);
	}

}
