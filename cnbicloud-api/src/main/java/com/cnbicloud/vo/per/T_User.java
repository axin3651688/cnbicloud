package com.cnbicloud.vo.per;

import java.io.Serializable;
import java.util.Date;

/**
 * 
* @ClassName: T_User  
* @Description: TODO(用户表)  
* @author 龚佳新 
* @date 2017年10月30日  
*
 */
public class T_User implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Long id;
	
	/**
	 * 登录名称
	 */
	private String username;
	
	/**
	 * 登录密码
	 */
	private String password;
	
	/**
	 * 真实姓名
	 */
	private String trueName;
	
	/**
	 * 生日
	 */
	private Date birthday;
	
	/**
	 * 邮箱
	 */
	private String email;
		
	/**
	 * 是否禁用或是否锁住
	 */
	private Integer enable;
	
	/**
	 * 头像或图标
	 */
	private String avatar;
	
	/**
	 * 电话
	 */
	private String phone;
	
	/**
	 * 签名或座右铭
	 */
	private String sign;
	
	public T_User() {}
	
	
	public T_User(Long id,String username) {
		this.id = id;
		this.username = username;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getTrueName() {
		return trueName;
	}


	public void setTrueName(String trueName) {
		this.trueName = trueName;
	}


	public Date getBirthday() {
		return birthday;
	}


	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public Integer getEnable() {
		return enable;
	}


	public void setEnable(Integer enable) {
		this.enable = enable;
	}


	public String getAvatar() {
		return avatar;
	}


	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getSign() {
		return sign;
	}


	public void setSign(String sign) {
		this.sign = sign;
	}
	
}
