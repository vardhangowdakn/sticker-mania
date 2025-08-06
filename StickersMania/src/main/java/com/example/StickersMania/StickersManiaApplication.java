package com.example.StickersMania;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditorAwareImpl")
@EnableJpaRepositories
@EntityScan
// @ComponentScan(basePackages = {"com.examples.StickerMania.controller"})
public class StickersManiaApplication {

	public static void main(String[] args) {

		SpringApplication.run(StickersManiaApplication.class, args);
	}

}
