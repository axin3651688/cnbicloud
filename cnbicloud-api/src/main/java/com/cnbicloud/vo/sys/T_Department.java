package com.cnbicloud.vo.sys;
import com.cnbicloud.vo.abs.TreeBean;

/**
 * 
 * @ClassName: T_Department
 * @Description: TODO(部门表)
 * @author 龚佳新
 * @date 2017年10月30日
 *
 */
public class T_Department extends TreeBean{

	private static final long serialVersionUID = 1L;

	public T_Department(){}
	
	/**
	 * 所属公司
	 */
	private String company;

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}
	
	
   
	

}
