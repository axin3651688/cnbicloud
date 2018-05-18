package com.cnbicloud.api.auth.role;

import java.io.Serializable;

public class Auth_Role_Sys_Source implements Serializable {

	/**
	 * @Fields field:{todo}(用一句话描述这个变量表示什么)
	 */
	private static final long serialVersionUID = 1L;
	private String id;

	private Long sourceId;

	private Long roleId;

	public Auth_Role_Sys_Source() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Auth_Role_Sys_Source(String id, Long sourceId, Long roleId) {
		super();
		this.id = id;
		this.sourceId = sourceId;
		this.roleId = roleId;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Long getSourceId() {
		return sourceId;
	}

	public void setSourceId(Long sourceId) {
		this.sourceId = sourceId;
	}

	public Long getRoleId() {
		return roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

}
