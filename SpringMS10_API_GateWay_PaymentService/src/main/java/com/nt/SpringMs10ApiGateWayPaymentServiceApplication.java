package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringMs10ApiGateWayPaymentServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMs10ApiGateWayPaymentServiceApplication.class, args);
	}

}
