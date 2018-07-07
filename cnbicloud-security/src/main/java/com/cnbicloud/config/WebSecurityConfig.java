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
		for(Entry<String,String> entry : CnbiConstants.getUserMap().entrySet()) {
			bulid.withUser(entry.getKey()).password(entry.getValue()).roles("USER", "ADMIN","ACTUATOR");
		}
		//SessionConnectEvent
		//SessionIdGenerator
		//auth.inMemoryAuthentication().withUser(CnbiConstants.PROVIDER_SERVICE_USER).password(CnbiConstants.PROVIDER_SERVICE_USER).roles("USER")
		//.and().withUser("admin").password("hello").roles("USER", "ADMIN");
		/*  auth.authenticationProvider(new AuthenticationProvider() {
			@Override
			public boolean supports(Class<?> authentication) {
				System.out.println(authentication);
				return UsernamePasswordAuthenticationToken.class.isAssignableFrom(authentication);
			}
			@Override
			public Authentication authenticate(Authentication authentication) throws AuthenticationException {
				UsernamePasswordAuthenticationToken token = (UsernamePasswordAuthenticationToken) authentication;
				//String pwd = (String) token.getCredentials();
				List<GrantedAuthority> authorities = AuthorityUtils.createAuthorityList("ROLE_ADMIN");
				return new UsernamePasswordAuthenticationToken(token.getName(), token.getCredentials(), authorities);
			}
		});*/
	}
    /**
     * 瀹氫箟鍝簺URL闇�瑕佽淇濇姢銆佸摢浜涗笉闇�瑕佽淇濇姢
     */
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// 琛ㄧず鎵�鏈夌殑璁块棶閮藉繀椤昏繘琛岃璇佸鐞嗗悗鎵嶅彲浠ユ甯歌繘琛�
		http.httpBasic().and().authorizeRequests().anyRequest().fullyAuthenticated().and().csrf().disable();
		// 鎵�鏈夌殑Rest鏈嶅姟涓�瀹氳璁剧疆涓烘棤鐘舵�侊紝浠ユ彁鍗囨搷浣滄�ц兘
		http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
	}
}
