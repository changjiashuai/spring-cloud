package com.changjiashuai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@EnableEurekaClient
@SpringBootApplication
@EnableFeignClients
public class EurekaClientSentenceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaClientSentenceApplication.class, args);
	}
}
