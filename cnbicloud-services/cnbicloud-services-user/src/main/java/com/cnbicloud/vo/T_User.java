package com.cnbicloud.vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 * 
* @ClassName: T_User  
* @Description: TODO(用户)  
* @author 龚佳新 
* @date 2018年3月23日  
*
 */
@Table
@Entity(name = "core_users")
public class T_User extends com.cnbicloud.api.core.T_User{

	/**  
	* @Fields field:{todo}(用一句话描述这个变量表示什么)  
	*/ 
	private static final long serialVersionUID = 1L;
	
	public T_User() {
		this.birthday = System.currentTimeMillis();
	}
	
	public T_User(String username,String password) {
		this.username = username;
		this.password = password;
	}
	
	
	
	
	@Column(name="susername",length = 32,unique = true)
	public String getUsername() {
		return username;
	}

	
	@Column(name="spassword",length = 36)
	public String getPassword() {
		return password;
	}

	
	@Column(name="semail",length = 32,unique = true)
	public String getEmail() {
		return email;
	}

	
	@Column(name="sphone",length = 11,unique = true)
	public String getPhone() {
		return phone;
	}

	
	@Column(name="struename",length = 28,unique = false)
	public String getTrueName() {
		return trueName;
	}

	
	@Column(name="dbirthday")
	public Long getBirthday() {
		return birthday;
	}

	@Column(name="ssign")
	public String getSign() {
		return sign;
	}
    
	@Column(length = 4)
	public Short getSex() {
		return sex;
	}
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	public Long getId() {
		return id;
	}
	@Column(length = 4)
	public Short getEnabled() {
		return enabled;
	}
	@Column(name="savatar",length = 88,unique = false)
	public String getAvatar() {
		return avatar;
	}

}
