package com.ryw.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringClientAApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringClientAApplication.class, args);
	}
}
