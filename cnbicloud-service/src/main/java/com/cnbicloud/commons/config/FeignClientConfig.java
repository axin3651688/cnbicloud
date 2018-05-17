<<<<<<< HEAD
package com.cnbicloud.commons.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import feign.Logger;
import feign.auth.BasicAuthRequestInterceptor;
@Configuration
public class FeignClientConfig {
	@Bean
	public Logger.Level getFeignLoggerLevel() {
		return feign.Logger.Level.FULL ;
	}
	/**
	 * 
	 * @Title: getBasicAuthRequestInterceptor  
	 * @Description: TODO(zuul代理的用户密码)  
	 * @param @return    参数  
	 * @return BasicAuthRequestInterceptor    返回类型  
	 * @throws
	 */
	@Bean
	public BasicAuthRequestInterceptor getBasicAuthRequestInterceptor() {
		return new BasicAuthRequestInterceptor("zdmin", "mldnjava");
	}
}
=======
package com.cnbicloud.commons.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import feign.Logger;
import feign.auth.BasicAuthRequestInterceptor;
@Configuration
public class FeignClientConfig {
	@Bean
	public Logger.Level getFeignLoggerLevel() {
		return feign.Logger.Level.FULL ;
	}
	/**
	 * 
	* @Title: getBasicAuthRequestInterceptor  
	* @Description: TODO(zuul代理的用户密码)  
	* @param @return    参数  
	* @return BasicAuthRequestInterceptor    返回类型  
	* @throws
	 */
	@Bean
	public BasicAuthRequestInterceptor getBasicAuthRequestInterceptor() {
		return new BasicAuthRequestInterceptor("zdmin", "mldnjava");
	}
}
>>>>>>> 46849f9e614725c540dee6367c27eb9b7d1d51c4
