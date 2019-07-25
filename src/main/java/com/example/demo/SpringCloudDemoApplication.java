package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestOperations;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaServer
public class SpringCloudDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudDemoApplication.class, args);
	}


}
