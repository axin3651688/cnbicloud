package com.cnbicloud.config;

import java.util.Map.Entry;

import javax.annotation.Resource;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configurers.provisioning.InMemoryUserDetailsManagerConfigurer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;

import com.cnbicloud.tools.CnbiConstants;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
	// @Override
	// public void configure(WebSecurity web) throws Exception {
	// web.ignoring().antMatchers("/hystrix.stream","/turbine.stream") ;
	// }

	@Resource
	public void configGlobal(AuthenticationManagerBuilder auth) throws Exception {
		InMemoryUserDetailsManagerConfigurer<AuthenticationManagerBuilder> bulid = auth.inMemoryAuthentication();
		//UserDetailsService userDetails = auth.getDefaultUserDetailsService();
		//userDetails.loadUserByUsername(arg0)
		for (Entry<String,String> entry : CnbiConstants.getUserMap().entrySet()) {
			bulid.withUser(entry.getKey()).password(entry.getValue()).roles("USER", "ADMIN");
		}
		//SessionIdGenerator
		//auth.inMemoryAuthentication().withUser(CnbiConstants.PROVIDER_SERVICE_USER).password(CnbiConstants.PROVIDER_SERVICE_USER).roles("USER")
		//.and().withUser("admin").password("hello").roles("USER", "ADMIN");
	}
    /**
     * 定义哪些URL需要被保护、哪些不需要被保护
     */
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// 表示所有的访问都必须进行认证处理后才可以正常进行
		http.httpBasic().and().authorizeRequests().anyRequest().fullyAuthenticated().and().csrf().disable();
		// 所有的Rest服务一定要设置为无状态，以提升操作性能
		http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
	}
}
