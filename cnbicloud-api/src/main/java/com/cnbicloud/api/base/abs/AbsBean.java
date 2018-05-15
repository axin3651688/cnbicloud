package com.cnbicloud.api.base.abs;
import java.io.Serializable;
/**
 * 
* @Description: TODO(公共类)  
* @author 龚佳新 
* @date 2017年11月29日  
* {id,enabled,avatar}
*
 */
public abstract class AbsBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	protected Long id;
	
	/**
	 * 是否禁用或是否锁住
	 */
	protected Short enabled;
	
	/**
	 * 头像或图标
	 */
	protected String avatar;
	
	public AbsBean() {}

	public AbsBean(Long id) {
		super();
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public Short getEnabled() {
		return enabled;
	}
	public String getAvatar() {
		return avatar;
	}
	public void setId(Long id) {
		this.id = id;
	}


	public void setEnabled(Short enabled) {
		this.enabled = enabled;
	}


	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}
	
	
	
	
	
	
}
