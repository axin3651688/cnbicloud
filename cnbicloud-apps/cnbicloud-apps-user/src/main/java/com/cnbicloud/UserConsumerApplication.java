package com.cnbicloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@EnableEurekaClient
@EnableHystrix
@EnableFeignClients(basePackages = { "com.cnbicloud.service" })
@SpringBootApplication(scanBasePackages = {"com.cnbicloud"},exclude={DataSourceAutoConfiguration.class,HibernateJpaAutoConfiguration.class})
public class UserConsumerApplication {
	public static void main(String[] args) {
		SpringApplication.run(UserConsumerApplication.class, args);
	}
}
