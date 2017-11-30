package com.cnbicloud.vo.per;

public class T_Role {
	
	
	private Long id;
	
	/**
	 * 角色编码
	 */
	private String code;
	
	/**
	 * 角色名称
	 */
	private	String text;
	
	/**
	 * 角色描述
	 */
	private String desc;
	
	/**
	 * 属于哪个公司的角色
	 */
	private String company;
	
	
    public T_Role() {}
    
    

	public T_Role(String code, String text, String desc){
		super();
		this.code = code;
		this.text = text;
		this.desc = desc;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
    
}
