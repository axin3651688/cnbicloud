package com.cnbicloud.api.auth.user;

import java.io.Serializable;

/**
 * 
* @ClassName: Auth_User_Sys_Sources  
* @Description: TODO(这里用一句话描述这个类的作用)  
* @author 龚佳新 
* @date 2018年5月17日  
*
 */
public class Auth_User_M_Source implements Serializable{

	/**  
	* @Fields field:{todo}(用一句话描述这个变量表示什么)  
	*/ 
	private static final long serialVersionUID = 1L;
	
	private String id;
	
	private Long moduleId;
	
	private Long userId;

	public Auth_User_M_Source() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Auth_User_M_Source(String id, Long moduleId, Long userId) {
		super();
		this.id = id;
		this.moduleId = moduleId;
		this.userId = userId;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Long getModuleId() {
		return moduleId;
	}

	public void setModuleId(Long moduleId) {
		this.moduleId = moduleId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}
	
	

}
