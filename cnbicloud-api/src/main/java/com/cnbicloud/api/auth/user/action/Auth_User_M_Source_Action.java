package com.cnbicloud.api.auth.user.action;

import java.io.Serializable;

/**
 * 
* @ClassName: Auth_User_Group_Action  
* @Description: TODO(这里用一句话描述这个类的作用)  
* @author 龚佳新 
* @date 2018年5月17日  
*
 */
public class Auth_User_M_Source_Action implements Serializable{

	/**  
	* @Fields field:{todo}(用一句话描述这个变量表示什么)  
	*/ 
	private static final long serialVersionUID = 1L;

	private Long umId;
	
	/**
	 * 动作类型
	 */
	private Long actionId;

	public Auth_User_M_Source_Action() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Auth_User_M_Source_Action(Long umId, Long actionId) {
		super();
		this.umId = umId;
		this.actionId = actionId;
	}

	public Long getUmId() {
		return umId;
	}

	public void setUmId(Long umId) {
		this.umId = umId;
	}

	public Long getActionId() {
		return actionId;
	}

	public void setActionId(Long actionId) {
		this.actionId = actionId;
	}
	
	
	
}
