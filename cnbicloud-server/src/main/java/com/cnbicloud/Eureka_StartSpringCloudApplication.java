package com.cnbicloud;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
/**
* @ClassName: Eureka_StartSpringCloudApplication  
* @Description: TODO(服务注册中心)  
* @author 龚佳新 
* @date 2017年10月31日  
 */
@SpringBootApplication
@EnableEurekaServer
public class Eureka_StartSpringCloudApplication {
    public static void main(String[] args) {
        SpringApplication.run(Eureka_StartSpringCloudApplication.class, args);
    }
}