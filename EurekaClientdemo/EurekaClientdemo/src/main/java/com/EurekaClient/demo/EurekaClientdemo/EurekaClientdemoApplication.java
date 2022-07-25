package com.EurekaClient.demo.EurekaClientdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EurekaClientdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaClientdemoApplication.class, args);
	}

}
