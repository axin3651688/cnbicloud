package com.cnbicloud.vo.sys;
import com.cnbicloud.vo.abs.TreeBean;
/**
	* @ClassName: T_Company  
	* @Description: TODO(公司表)  
	* @author Administrator  
	* @date 2017年10月30日  
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
    private int range;
    
    
    
    

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

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

	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}
    
    
    
    
    
    
    
}
