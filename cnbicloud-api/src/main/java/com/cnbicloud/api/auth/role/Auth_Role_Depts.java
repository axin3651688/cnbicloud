package com.cnbicloud.api.auth.role;

import java.io.Serializable;

public class Auth_Role_Depts implements Serializable {

	/**
	 * @Fields field:{todo}(用一句话描述这个变量表示什么)
	 */
	private static final long serialVersionUID = 1L;

	private String id;

	private Long roleId;
	/**
	 * 授权的部门
	 */
	private Long deptId;

	public Auth_Role_Depts() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Auth_Role_Depts(String id, Long roleId, Long deptId) {
		super();
		this.id = id;
		this.roleId = roleId;
		this.deptId = deptId;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Long getRoleId() {
		return roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

	public Long getDeptId() {
		return deptId;
	}

	public void setDeptId(Long deptId) {
		this.deptId = deptId;
	}

}
