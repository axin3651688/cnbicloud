package com.cnbicloud.api.auth.user;

import java.io.Serializable;
/**
 * 用户群关系表
* @ClassName: Auth_User_Group  
* @Description: TODO(这里用一句话描述这个类的作用)  
* @author 龚佳新 
* @date 2018年5月17日  
*
 */
public class Auth_User_Group implements Serializable{

	/**  
	* @Fields field:{todo}(用一句话描述这个变量表示什么)  
	*/ 
	private static final long serialVersionUID = 1L;

	
	private String id;
	
	private Long userId;
	
	private Long groupId;

	public Auth_User_Group() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Auth_User_Group(String id, Long userId, Long groupId) {
		super();
		this.id = id;
		this.userId = userId;
		this.groupId = groupId;
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

	public Long getGroupId() {
		return groupId;
	}

	public void setGroupId(Long groupId) {
		this.groupId = groupId;
	}
	
	

}
