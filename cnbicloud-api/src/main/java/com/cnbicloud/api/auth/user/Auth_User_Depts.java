package com.cnbicloud.api.auth.user;

import java.io.Serializable;
/**
 * 
* @ClassName: Auth_User_Depts  
* @Description: TODO(用户部门关系表)  
* @author 龚佳新 
* @date 2018年5月17日  
*
 */
public class Auth_User_Depts implements Serializable{

	/**  
	* @Fields field:{todo}(用一句话描述这个变量表示什么)  
	*/ 
	private static final long serialVersionUID = 1L;

	private String id;

	private Long userId;
	/**
	 * 授权的部门
	 */
	private Long deptId;
	
	public Auth_User_Depts() {}

	public Auth_User_Depts(String id, Long userId, Long deptId) {
		super();
		this.id = id;
		this.userId = userId;
		this.deptId = deptId;
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

	public Long getDeptId() {
		return deptId;
	}

	public void setDeptId(Long deptId) {
		this.deptId = deptId;
	}
	
	
	
	
}
