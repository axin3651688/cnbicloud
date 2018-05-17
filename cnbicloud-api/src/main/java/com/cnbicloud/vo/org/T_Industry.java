package com.cnbicloud.vo.org;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.cnbicloud.vo.abs.AbstractBaseLevelTree;

/**
	* @ClassName: T_Company  
	* @Description: TODO(公司表)  
	* @author Administrator  
	* @date 2017年10月30日  
	*
 */
@Entity
@Table(name = "dim_industry")
public class T_Industry extends AbstractBaseLevelTree{

		

	private static final long serialVersionUID = 1L;
	
	/*
	 * 级别
	 */
	public Short lev;
	/**
	 * 是否为叶子
	 */
	public Short leaf;
	
	/**
	 *  type 参数类型【1:国资委,2:农垦局】
	 */
	public Short typ;
	
	@OneToMany(mappedBy="industry",fetch=FetchType.LAZY)
	private Set<T_IndustryParam> industryParams;
	
	
	@OneToMany(mappedBy="industry",fetch=FetchType.LAZY)
	private Set<T_Company> companys;
	
	public T_Industry(String id,String text) {
		super(id, text);
	}

	public Short getLev() {
		return lev;
	}

	public void setLev(Short lev) {
		this.lev = lev;
	}

	public Short getLeaf() {
		return leaf;
	}

	public void setLeaf(Short leaf) {
		this.leaf = leaf;
	}

	public Short getTyp() {
		return typ;
	}

	public void setTyp(Short typ) {
		this.typ = typ;
	}

	public Set<T_IndustryParam> getIndustryParams() {
		return industryParams;
	}

	public void setIndustryParams(Set<T_IndustryParam> industryParams) {
		this.industryParams = industryParams;
	}

	public Set<T_Company> getCompanys() {
		return companys;
	}

	public void setCompanys(Set<T_Company> companys) {
		this.companys = companys;
	}
	
	

    
    
}
