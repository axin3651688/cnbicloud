package com.cnbicloud.api.core;
import com.cnbicloud.api.base.tree.TreeBean;
/**
 * 
* @ClassName: T_Company  
* @Description: TODO(公司类)  
* @author 龚佳新 
* @date 2018年3月26日  
*
 */
public class T_Company extends TreeBean{

		

	private static final long serialVersionUID = 1L;
	/**
	 * 所属license,即认证信息
	 */
	protected String license;
	/**
	 * 所属行业
	 */
	protected String industry;
	
	/**
	 * 名称 [全称]
	 */
	protected String fullname;
	
	/**
	 * 规模
	 */
	
	protected Short scale;
    
    
    /**
     * 所处城市
     */
	protected String city;


	public void setLicense(String license) {
		this.license = license;
	}


	public void setIndustry(String industry) {
		this.industry = industry;
	}


	public void setFullname(String fullname) {
		this.fullname = fullname;
	}


	public void setScale(Short scale) {
		this.scale = scale;
	}


	public void setCity(String city) {
		this.city = city;
	}


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

  //
	
	
}
