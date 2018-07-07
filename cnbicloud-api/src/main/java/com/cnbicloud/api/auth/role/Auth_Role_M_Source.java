package com.cnbicloud.api.auth.role;

import java.io.Serializable;

/**
 * 
* @ClassName: Auth_Role_M_Source  
* @Description: TODO(角色模块资源权限)  
* @author 龚佳新 
* @date 2018年6月21日  
*
 */
public class Auth_Role_M_Source implements Serializable {

	/**
	 * @Fields field:{todo}(用一句话描述这个变量表示什么)
	 */
	private static final long serialVersionUID = 1L;
	private String id;

	private Long moduleId;

	private Long roleId;

	public Auth_Role_M_Source() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Auth_Role_M_Source(String id, Long moduleId, Long roleId) {
		super();
		this.id = id;
		this.moduleId = moduleId;
		this.roleId = roleId;
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

	public Long getRoleId() {
		return roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

}
