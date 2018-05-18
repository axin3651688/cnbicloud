package com.cnbicloud.vo;

import javax.persistence.Table;

@Table(name = "sys_company")
public class T_Company extends com.cnbicloud.api.core.T_Company{

	/**  
	* @Fields field:{todo}(用一句话描述这个变量表示什么)  
	*/ 
	private static final long serialVersionUID = 1L;
	
	
	public String getLicense() {
		return license;
	}


	public String getIndustry() {
		return industry;
	}


	public String getFullname() {
		return fullname;
	}


	public Short getScale() {
		return scale;
	}


	public String getCity() {
		return city;
	}
	

	public void setLeaf(Short leaf) {
		this.leaf = leaf;
	}
	
	public Short getLeaf() {
		return leaf;
	}
	
	public Short getLev() {
		return lev;
	}
	

	public String getDes() {
		return des;
	}

	public String getSpcode() {
		return spcode;
	}
	
	public String getText() {
		return text;
	}

	public String getCode() {
		return code;
	}
}
