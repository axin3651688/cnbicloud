<<<<<<< HEAD
package com.cnbicloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
public class Zuul_9501_StartSpringCloudApplication {
	public static void main(String[] args) {
		SpringApplication.run(Zuul_9501_StartSpringCloudApplication.class, args);
	}
}
=======
package com.cnbicloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
@EnableZuulProxy
@EnableEurekaClient
@SpringBootApplication(exclude={DataSourceAutoConfiguration.class,HibernateJpaAutoConfiguration.class})
public class Zuul_9501_StartSpringCloudApplication {
	public static void main(String[] args) {
		SpringApplication.run(Zuul_9501_StartSpringCloudApplication.class, args);
	}
}
>>>>>>> 46849f9e614725c540dee6367c27eb9b7d1d51c4
