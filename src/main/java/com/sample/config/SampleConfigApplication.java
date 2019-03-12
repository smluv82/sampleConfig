package com.sample.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class SampleConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(SampleConfigApplication.class, args);
	}
}
