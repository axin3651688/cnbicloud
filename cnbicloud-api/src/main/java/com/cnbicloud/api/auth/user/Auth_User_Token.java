package com.cnbicloud.api.auth.user;

import java.io.Serializable;
/**
 * 
* @ClassName: Auth_User_Token  
* @Description: TODO(认证的token)  
* @author 龚佳新 
* @date 2018年5月18日  
*
 */
public class Auth_User_Token implements Serializable{

	/**  
	* @Fields field:{todo}(用一句话描述这个变量表示什么)  
	*/ 
	private static final long serialVersionUID = 1L;


	private Long id;

	private Long userId;
    /**
     * 授权的应用
     */
	private String module;
	
	/**
	 * 应用的授权码
	 */
	private String token;
    
	/**
	 * 失效时间 ,
	 */
	private Long expireTime;
	
	/**
	 * 应用类型
	 * 内部应用：1
	 * 外部应用：2
	 */
	private Integer type;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getModule() {
		return module;
	}

	public void setModule(String module) {
		this.module = module;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public Long getExpireTime() {
		return expireTime;
	}

	public void setExpireTime(Long expireTime) {
		this.expireTime = expireTime;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}
	
	
	
	
	
}
