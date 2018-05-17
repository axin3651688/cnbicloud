package com.cnbicloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
/**
  * @ClassName: UserApplication  
  * @Description: TODO(用户微服务)  
  * @author 龚佳新 
  * @date 2017年12月7日  
 */
@EnableEurekaClient
@EnableDiscoveryClient
@SpringBootApplication
public class UserApplication {
	public static void main(String[] args) {
		SpringApplication.run(UserApplication.class, args);
	}
}

