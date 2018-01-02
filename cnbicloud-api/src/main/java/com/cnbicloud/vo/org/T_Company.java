package com.cnbicloud.vo.org;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.cnbicloud.vo.abs.TreeBean;
import com.cnbicloud.vo.region.R_City;
/**
	* @ClassName: T_Company  
	* @Description: TODO(公司表)  
	* @author Administrator  
	* @date 2017年10月30日  
	*
 */
@Entity
@Table(name = "dim_company")
public class T_Company extends TreeBean{

		

	private static final long serialVersionUID = 1L;
	/**
	 * 所属license,即认证信息
	 */
	@Column(length = 36)
	private String license;
	/**
	 * 所属行业
	 */
	@ManyToOne( cascade = { CascadeType.ALL},optional = true,fetch = FetchType.LAZY)
	@JoinColumn(unique = false, nullable = true, updatable = false)
	private T_Industry industry;
	
	/**
	 * 名称 [全称]
	 */
	@Column(length = 48)
	private String fullname;
	
	/**
	 * 规模
	 */
	
    private Short scale;
    
    @ManyToOne( cascade = { CascadeType.ALL},optional = true,fetch = FetchType.LAZY)
	@JoinColumn(unique = false, nullable = true, updatable = false)
    private R_City city;
    
    
    /**
     * 这个公司有多少个部门
     * 
     */
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "company")
	private Set<T_Department> departments;
    
    

	public R_City getCity() {
		return city;
	}

	public void setCity(R_City city) {
		this.city = city;
	}

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

	public T_Industry getIndustry() {
		return industry;
	}

	public void setIndustry(T_Industry industry) {
		this.industry = industry;
	}

	public Short getScale() {
		return scale;
	}

	public void setScale(Short scale) {
		this.scale = scale;
	}

	public Set<T_Department> getDepartments() {
		return departments;
	}

	public void setDepartments(Set<T_Department> departments) {
		this.departments = departments;
	}

	
    
    
    
    
    
}
