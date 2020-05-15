package com.hao.microservice.eureka1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@SpringBootApplication
@EnableEurekaServer//什么这是一个eureka服务
public class Eureka1Application {

	public static void main(String[] args) {
		SpringApplication.run(Eureka1Application.class, args);
	}

}
