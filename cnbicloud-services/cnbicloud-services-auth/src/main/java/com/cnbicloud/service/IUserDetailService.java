package com.cnbicloud.service;
import java.util.*;
import javax.annotation.Resource;
import org.springframework.core.env.Environment;
import org.springframework.security.authentication.AuthenticationCredentialsNotFoundException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.cnbicloud.api.auth.Auth_Action;
import com.cnbicloud.api.core.T_Role;
import com.cnbicloud.api.core.T_User;
import com.cnbicloud.pojo.SecurityUser;
@Service
public class IUserDetailService implements UserDetailsService {
	
	private static final String SERVER_URLS_PREFIX = "auth.server";
	
	private static final String SERVER_URLS[] = {SERVER_URLS_PREFIX+".user",SERVER_URLS_PREFIX+".auth"};
	
	@Resource
	private RestTemplate restTemplate ;
	
	
	@Resource
	private Environment env ;
	
	private String getServerUrlByUsername(String username,int index) {
		String server = env.getProperty(SERVER_URLS[index]);
		String url = server+"?username=" + username ;
		return url;
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		String url = getServerUrlByUsername(username, 0);
		T_User user = this.restTemplate.postForObject(url, null, T_User.class) ; // 通过用户名获取用户信息
		if (user == null) {
			throw new UsernameNotFoundException("搞什么搞，用户【"+username+"】不存在！");
		}
		 // 取得用户的权限
		SecurityUser  userDetail = loadAuthorizationInfo(user);
        return userDetail;
	}
	
	
	/**
	* @Title: authorizationInfo  
	* @Description: TODO(加载用户的角色与权限信息)  
	* @param  user    参数  
	* @return void    返回类型  
	* @throws
	 */
	@SuppressWarnings("unchecked")
	private  SecurityUser loadAuthorizationInfo (T_User user){
		String url = getServerUrlByUsername(user.getUsername(),1);
		Map<String,Object> map = this.restTemplate.postForObject(url, null, Map.class) ;
		if (map == null) {
			throw new AuthenticationCredentialsNotFoundException("搞什么搞，用户【"+user.getUsername()+"】还没有授权！");
		}
        return getSecurityUser(map, user);
	}
	/**
	 * 
	* @Title: getSecurityUser  
	* @Description: TODO(获取用户的角色与权限信息)  
	* @param  map
	* @param  user
	* @param     参数  
	* @return SecurityUser    返回类型  
	* @throws
	 */
	@SuppressWarnings("unchecked")
	private SecurityUser getSecurityUser(Map<String,Object> map,T_User user) {
		Set<T_Role> roles = new HashSet<T_Role>() ;
		//Set<String> allActions = new HashSet<String>() ;
		roles.addAll((List<T_Role>) map.get("allRoles"));
		//allActions.addAll((List<String>) map.get("allActions")) ;
		Boolean isUnLocked = new Boolean(user.getEnabled().toString());
		//Set<T_Role> roles = (List<T_Role>) map.get("roles") ;
		List<Auth_Action> resources = (List<Auth_Action>) map.get("permissions") ;
		//user.setRoles(allRoles);
		//user.setPermissions(allActions);
     
        Set<GrantedAuthority> authSet = new HashSet<GrantedAuthority>();
        for (Auth_Action r :resources) {
            //用户可以访问的资源名称（或者说用户所拥有的权限）
            authSet.add(new SimpleGrantedAuthority(r.getCode()));
        }
        SecurityUser userDetail = new SecurityUser(user.getUsername(),user.getPassword(),
                true,//是否可用
                true,//是否过期
                true,//证书不过期为true
                isUnLocked,//账户未锁定为true ,
                authSet);
        userDetail.setRoles(roles);
		return userDetail;
	}
}
