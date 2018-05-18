package com.cnbicloud.pojo;

import java.util.Collection;
import java.util.Set;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import com.cnbicloud.api.core.T_Role;

/**
 * 
 * @Company 中国经邦
 * @Author 龚佳新
 * @Time 2017年12月3日上午9:06:52
 */
public class SecurityUser  extends User{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8839735560493380279L;
	
	
	private Set<T_Role> roles ;

	public SecurityUser(String username, String password, boolean enabled, boolean accountNonExpired,
			boolean credentialsNonExpired, boolean accountNonLocked,
			Collection<? extends GrantedAuthority> authorities) {
		super(username, password, enabled, accountNonExpired, credentialsNonExpired, accountNonLocked, authorities);
	}

	public Set<T_Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<T_Role> roles) {
		this.roles = roles;
	}


	
	

	
	

}
