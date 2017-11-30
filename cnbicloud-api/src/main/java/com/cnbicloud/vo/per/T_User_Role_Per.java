package com.cnbicloud.vo.per;
/**
 * 
* @ClassName: T_User_Role_Per  
* @Description: TODO(用户角色权限)  
* @author 龚佳新 
* @date 2017年11月30日  
*
 */
public class T_User_Role_Per {
	
	/**
	 * 用户
	 */
	private Long user;
	/**
	 * 角色
	 */
    private Long role;
    
    /**
     * 权限
     */
    private Integer per;
    
    /**
     * 模块
     */
    private String moduleId;
    
    private T_User_Role_Per() {}

	public Long getUser() {
		return user;
	}

	public void setUser(Long user) {
		this.user = user;
	}

	public Long getRole() {
		return role;
	}

	public void setRole(Long role) {
		this.role = role;
	}

	public Integer getPer() {
		return per;
	}

	public void setPer(Integer per) {
		this.per = per;
	}

	public String getModuleId() {
		return moduleId;
	}

	public void setModuleId(String moduleId) {
		this.moduleId = moduleId;
	}
    
    

}
