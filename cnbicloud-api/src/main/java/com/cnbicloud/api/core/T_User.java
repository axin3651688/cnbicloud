package com.cnbicloud.api.core;

import com.cnbicloud.api.base.abs.AbsBean;
/**
 * 
* @ClassName: T_User  
* @Description: TODO(用户API实体)  
* @author 龚佳新 
* @date 2018年3月21日  
*
 */
public class T_User extends AbsBean {

	/**  
	* @Fields field:{todo}(用一句话描述这个变量表示什么)  
	*/ 
	private static final long serialVersionUID = 1L;
	
	public T_User() {}
	
	public T_User(String username) {
		this.username = username;
	}
	
	/**
	 * 登录名称
	 */
	public String username;
	
	/**
	 * 登录密码
	 */
	public String password;
	/**
	 * 邮箱
	 */
	public String email;
		
	
	
	/**
	 * 电话
	 */
	public String phone;
	
	/**
	 * 真实姓名
	 */
	public String trueName;
	
	/**
	 * 生日
	 */
	public Long birthday;
	
	
	/**
	 * 签名或座右铭
	 */
	public String sign;
	
	/**
	 * sex [1:男，2：女 else 未知]
	 */
	public Short sex;

	public String getUsername() {
		return username;
	}

	

	public String getPassword() {
		return password;
	}

	

	public String getEmail() {
		return email;
	}

	

	public String getPhone() {
		return phone;
	}

	

	public String getTrueName() {
		return trueName;
	}

	

	public Long getBirthday() {
		return birthday;
	}


	public String getSign() {
		return sign;
	}

	public Short getSex() {
		return sex;
	}
	public void setSign(String sign) {
		this.sign = sign;
	}


	public void setSex(Short sex) {
		this.sex = sex;
	}
	public void setBirthday(Long birthday) {
		this.birthday = birthday;
	}
	public void setTrueName(String trueName) {
		this.trueName = trueName;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
}
