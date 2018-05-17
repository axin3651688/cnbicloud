package com.cnbicloud.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.InMemoryTokenStore;

import com.cnbicloud.service.IUserDetailService;
/**
 * 
* @ClassName: OAuth2AuthorizationConfig  
* @Description: TODO(这里用一句话描述这个类的作用)  
* @author 龚佳新 
* @date 2017年12月6日  
*   authorization_code：授权码类型。
*	implicit：隐式授权类型。
*	password：资源所有者（即用户）密码类型。
*	client_credentials：客户端凭据（客户端ID以及Key）类型。
*	refresh_token：通过以上授权获得的刷新令牌来获取新的令牌。
 */
@Configuration
@EnableAuthorizationServer 
public class OAuth2AuthorizationConfig extends AuthorizationServerConfigurerAdapter {

	private TokenStore tokenStore = new InMemoryTokenStore();

	@Autowired
	@Qualifier("authenticationManagerBean")
	private AuthenticationManager authenticationManager;

	@Autowired
	private IUserDetailService userDetailsService;

	@Autowired
	private Environment env;

	@Override
	public void configure(ClientDetailsServiceConfigurer clients) throws Exception {

		// TODO persist clients details

		// @formatter:off
		clients.inMemory()
				.withClient("browser")
				.authorizedGrantTypes("refresh_token", "password")
				.scopes("ui")
		.and()
				.withClient("account-service")
				.secret(env.getProperty("ACCOUNT_SERVICE_PASSWORD"))
				.authorizedGrantTypes("client_credentials", "refresh_token")
				.scopes("server")
		.and()
				.withClient("statistics-service")
				.secret(env.getProperty("STATISTICS_SERVICE_PASSWORD"))
				.authorizedGrantTypes("client_credentials", "refresh_token")
				.scopes("server")
		.and()
				.withClient("notification-service")
				.secret(env.getProperty("NOTIFICATION_SERVICE_PASSWORD"))
				.authorizedGrantTypes("client_credentials", "refresh_token")
				.scopes("server");
		// @formatter:on
	}

	@Override
	public void configure(AuthorizationServerEndpointsConfigurer endpoints) throws Exception {
		endpoints
				.tokenStore(tokenStore)
				.authenticationManager(authenticationManager)
				.userDetailsService(userDetailsService);
	}

	@Override
	public void configure(AuthorizationServerSecurityConfigurer oauthServer) throws Exception {
		oauthServer
				.tokenKeyAccess("permitAll()")
				.checkTokenAccess("isAuthenticated()");
	}
}
/*Spring Security OAuth2默认提供的四个URL：
/oauth/authorize ： 授权AuthorizationEndpoint
/oauth/token ： 令牌TokenEndpoint
/oauth/check_token ： 令牌校验CheckTokenEndpoint
/oauth/confirm_access ： 授权页面WhitelabelApprovalEndpoint
/oauth/error ： 错误页面WhitelabelErrorEndpoint*/