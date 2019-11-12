package com.deuteronomy.config.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class DeuteronomyConfigApplication {
	public static void main(String[] args) {
		SpringApplication.run(DeuteronomyConfigApplication.class, args);
	}
}
