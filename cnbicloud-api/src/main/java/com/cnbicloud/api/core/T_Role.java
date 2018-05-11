package com.cnbicloud.api.core;
import java.io.Serializable;
/**
 * 
* @ClassName: T_Role  
* @Description: TODO(角色)  
* @author 龚佳新 
* @date 2018年3月23日  
*
 */
public class T_Role implements Serializable {
	
	
	
	private static final long serialVersionUID = 1L;
   

	private Integer id;
	
	/**
	 * 角色编码[super,admin...]
	 */
	private String code;
	
	/**
	 * 角色名称
	 */
	private	String text;
	
	/**
	 * 角色描述
	 */
	private String des;
	
	/**
	 * 属于哪个公司的角色
	 */
	private String company;
	
	
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
