package com.cnbicloud.vo.per;
import java.util.Date;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;

import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.cnbicloud.vo.abs.AbstractUser;

import javax.persistence.JoinColumn;
/**
 * 
* @ClassName: T_User  
* @Description: TODO(用户表)  
* @author 龚佳新 
* @date 2017年10月30日  
*
 */
@Entity
@Table(name = "sys_user")
public class T_User extends AbstractUser {

	private static final long serialVersionUID = 1L;
	
	
	
	/**
	 * 登录名称
	 */
	@Column(name="susername",length = 32,unique = true)
	private String username;
	
	/**
	 * 登录密码
	 */
	@Column(name="spassword",length = 36)
	private String password;
	/**
	 * 邮箱
	 */
	@Column(name="semail",length = 32,unique = true)
	private String email;
		
	
	
	/**
	 * 电话
	 */
	@Column(name="sphone",length = 11,unique = true)
	private String phone;
	
	/**
	 * 真实姓名
	 */
	@Column(name="struename",length = 28,unique = false)
	private String trueName;
	
	/**
	 * 生日
	 */
	@Column(name="dbirthday")
	private Date birthday;
	
	
	/**
	 * 签名或座右铭
	 */
	@Column(name="ssign")
	private String sign;
	
	/**
	 * sex [1:男，2：女 else 未知]
	 */
	@Column(length = 4)
	private Short sex;
	
	
    /**
     * 多对多，就是一个用户有可以有多个角色,一个角色也可以被多个用户持有
     */
	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinTable(name = "sys_user_role", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
	private Set<T_Role> roles;
	
	/**
	 * 多对多   一个用户可以有多个组，一个组也可以被多个用户持有
	 */
	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinTable(name = "sys_user_group", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "group_id"))
	private Set<T_Group> groups;
	
	
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


	public Set<T_Role> getRoles() {
		return roles;
	}


	public void setRoles(Set<T_Role> roles) {
		this.roles = roles;
	}


	public Set<T_Group> getGroups() {
		return groups;
	}


	public void setGroups(Set<T_Group> groups) {
		this.groups = groups;
	}
	
	
	
}
