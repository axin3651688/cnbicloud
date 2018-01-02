package com.cnbicloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
@SpringBootApplication(scanBasePackages = {"com.cnbicloud"})
@EnableEurekaClient
@EnableFeignClients(basePackages = { "com.cnbicloud.service" })
public class Consumer_81_StartSpringCloudApplication {

	public static void main(String[] args) {
		SpringApplication.run(Consumer_81_StartSpringCloudApplication.class, args);

	}

}
