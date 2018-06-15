package com.cnbicloud.vo;

import javax.persistence.Table;

@Table(name = "sys_company")
public class T_Company extends com.cnbicloud.api.core.T_Company {

	/**
	 * @Fields field:{todo}(用一句话描述这个变量表示什么)
	 */
	private static final long serialVersionUID = 1L;
	// ----------------------------------------------------------
   
	public Long getId() {
		return id;
	}

	public Short getEnabled() {
		return enabled;
	}

	public String getAvatar() {
		return avatar;
	}
	// ---------------------

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

	// ----------------------------------------------------------------

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

}
