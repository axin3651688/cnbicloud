package com.cnbicloud.vo;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "org_dept")
public class T_Dept extends com.cnbicloud.api.core.T_Dept {

	/**
	 * @Fields field:{todo}(用一句话描述这个变量表示什么)
	 */
	private static final long serialVersionUID = 1L;
	// ----------------------------------------------------------
   
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	public Long getId() {
		return id;
	}
	@Column(nullable = false)
	public Short getEnabled() {
		return enabled;
	}
    
	@Column(nullable = true,length = 80)
	public String getAvatar() {
		return avatar;
	}
	// ---------------------
	@Column(nullable = false)
	public Short getLeaf() {
		return leaf;
	}
	@Column(nullable = false)
	public Short getLev() {
		return lev;
	}
	@Column(nullable = true,length = 255)
	public String getDes() {
		return des;
	}
	@Column(nullable = true,length = 32)
	public String getSpcode() {
		return spcode;
	}
    
	@Column(nullable = true,length = 32)
	public String getText() {
		return text;
	}
	@Column(nullable = true,length = 32)
	public String getCode() {
		return code;
	}

	
	@Column(nullable = true,length = 32)
	public String getCity() {
		return city;
	}
	@Column(nullable = true)
	public String getCompany() {
		return company;
	}

}
