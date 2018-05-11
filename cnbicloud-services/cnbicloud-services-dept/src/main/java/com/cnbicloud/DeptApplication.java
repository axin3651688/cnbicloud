package com.cnbicloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
/**
 * @ClassName: DeptApplication
 * @Description: TODO(部门微服务)
 * @author 龚佳新
 * @date 2017年10月31日
 *
 */
@EnableEurekaClient
@EnableDiscoveryClient
@SpringBootApplication
public class DeptApplication {
	public static void main(String[] args) {
		SpringApplication.run(DeptApplication.class, args);
		//SpringApplicationBuilder
	}
}
