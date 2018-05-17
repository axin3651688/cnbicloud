package com.cnbicloud;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

/** 
* @ClassName: AuthApplication  
* @Description: TODO(第三方认证的服务)  
* @author 龚佳新 
* @date 2017年12月6日  
 */
@SpringBootApplication
@EnableResourceServer
@EnableDiscoveryClient
public class AuthApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuthApplication.class, args);
	}

	

	
}
