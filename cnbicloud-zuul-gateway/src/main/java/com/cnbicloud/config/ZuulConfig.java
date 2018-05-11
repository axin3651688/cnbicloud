package com.cnbicloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.cnbicloud.filter.AuthorizedRequestFilter;
/**
 * 
* @ClassName: ZuulConfig  
* @Description: TODO(这里用一句话描述这个类的作用)  
* @author 龚佳新 
* @date 2018年1月23日  
*
 */
@Configuration
public class ZuulConfig {
	@Bean
	public AuthorizedRequestFilter getAuthorizedRequestFilter() {
		return new AuthorizedRequestFilter() ;
	}
}
