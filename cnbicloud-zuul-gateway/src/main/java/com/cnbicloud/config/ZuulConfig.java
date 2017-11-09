package com.cnbicloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.cnbicloud.filter.AuthorizedRequestFilter;


@Configuration
public class ZuulConfig {
	@Bean
	public AuthorizedRequestFilter getAuthorizedRequestFilter() {
		return new AuthorizedRequestFilter() ;
	}
}
