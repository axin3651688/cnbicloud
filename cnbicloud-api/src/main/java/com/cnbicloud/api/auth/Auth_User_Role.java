package com.cnbicloud.api.auth;

import java.io.Serializable;
/**
 * 
* @ClassName: Auth_User_Role  
* @Description: TODO(这用户角色关系表)  
* @author 龚佳新 
* @date 2018年5月17日  
*
 */
public class Auth_User_Role implements Serializable{

	
	/**  
	* @Fields field:{todo}(用一句话描述这个变量表示什么)  
	*/ 
	private static final long serialVersionUID = 1L;

	/**
	 * 用户Id@roleId
	 */
	private String id;
	
	private Long userId;
	
	private Long roleId;
	
	public Auth_User_Role() {}
	
	
	public Auth_User_Role(String id, Long userId, Long roleId) {
		super();
		this.id = id;
		this.userId = userId;
		this.roleId = roleId;
	}


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getRoleId() {
		return roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}
	
	
	

}
