package com.cnbicloud.api.core;
import com.cnbicloud.api.base.TreeBean;
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
	private String license;
	/**
	 * 所属行业
	 */
	private String industry;
	
	/**
	 * 名称 [全称]
	 */
	private String fullname;
	
	/**
	 * 规模
	 */
	
    private Short scale;
    
    
    /**
     * 所处城市
     */
    private String city;


	public String getLicense() {
		return license;
	}


	public void setLicense(String license) {
		this.license = license;
	}


	public String getIndustry() {
		return industry;
	}


	public void setIndustry(String industry) {
		this.industry = industry;
	}


	public String getFullname() {
		return fullname;
	}


	public void setFullname(String fullname) {
		this.fullname = fullname;
	}


	public Short getScale() {
		return scale;
	}


	public void setScale(Short scale) {
		this.scale = scale;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}
    
    
    
    
    
}
