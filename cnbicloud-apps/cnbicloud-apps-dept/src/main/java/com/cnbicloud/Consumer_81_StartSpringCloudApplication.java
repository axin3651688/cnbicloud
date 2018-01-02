package com.cnbicloud;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
@EnableEurekaClient
//@EnableHystrix
@EnableFeignClients(basePackages = { "com.cnbicloud.service" })
@SpringBootApplication(scanBasePackages = {"com.cnbicloud"},exclude={DataSourceAutoConfiguration.class,HibernateJpaAutoConfiguration.class})
public class Consumer_81_StartSpringCloudApplication {

	public static void main(String[] args) {
		SpringApplication.run(Consumer_81_StartSpringCloudApplication.class, args);

	}

}
