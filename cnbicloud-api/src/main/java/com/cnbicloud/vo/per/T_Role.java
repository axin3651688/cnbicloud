package com.cnbicloud.vo.per;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.JoinColumn;

@Entity
@Table(name = "sys_role")
public class T_Role implements Serializable {
	
	
	/**  
	* @Fields field:{todo}(用一句话描述这个变量表示什么)  
	*/ 
	private static final long serialVersionUID = 1L;
   
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	/**
	 * 角色编码[super,admin...]
	 */
	@Column(length = 28,unique = true,nullable = false)
	private String code;
	
	/**
	 * 角色名称
	 */
	@Column(length = 32)
	private	String text;
	
	/**
	 * 角色描述
	 */
	@Column(length = 255)
	private String des;
	
	/**
	 * 属于哪个公司的角色
	 */
	@Column(length = 16)
	private String company;
	
	
	 @ManyToMany(mappedBy = "roles", fetch = FetchType.LAZY)
	 private Set<T_User> users;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(name = "sys_role_permission", joinColumns = {@JoinColumn(name = "role_id")}, inverseJoinColumns = {@JoinColumn(name = "per_id")})
    private Set<T_Permission> resources;
	
	
	
    public T_Role() {}
    

	public T_Role(String code, String text, String des){
		super();
		this.code = code;
		this.text = text;
		this.des = des;
	}



	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	

	public String getCompany() {
		return company;
	}



	public void setCompany(String company) {
		this.company = company;
	}



	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getDes() {
		return des;
	}

	public void setDesc(String des) {
		this.des = des;
	}
    
}
