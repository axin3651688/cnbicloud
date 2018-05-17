package com.cnbicloud.vo.org;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.cnbicloud.vo.abs.TreeBean;
import com.cnbicloud.vo.region.R_City;

/**
 * 
 * @ClassName: T_Department
 * @Description: TODO(部门表)
 * @author 龚佳新
 * @date 2017年10月30日
 *
 */
@Entity
@Table(name = "dim_dept")
public class T_Department extends TreeBean {

	private static final long serialVersionUID = 1L;

	public T_Department() {}

	/**
	 * 所属公司
	 */
	@ManyToOne( cascade = { CascadeType.ALL},optional = true,fetch = FetchType.LAZY)
	@JoinColumn(unique = false, nullable = true, updatable = false)
	private T_Company company;

	@ManyToOne( cascade = { CascadeType.ALL},optional = true,fetch = FetchType.LAZY)
	@JoinColumn(unique = false, nullable = true, updatable = false)
	private R_City city;

	public R_City getCity() {
		return city;
	}

	public void setCity(R_City city) {
		this.city = city;
	}

	public T_Company getCompany() {
		return company;
	}

	public void setCompany(T_Company company) {
		this.company = company;
	}

}
