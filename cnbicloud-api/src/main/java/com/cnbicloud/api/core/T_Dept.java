package com.cnbicloud.api.core;
import com.cnbicloud.api.base.tree.TreeBean;

/**
 * 
* @ClassName: T_Dept  
* @Description: TODO(部门类)  
* @author 龚佳新 
* @date 2018年3月26日  
*
 */
public class T_Dept extends TreeBean{

	/**  
	* @Fields field:{todo}(用一句话描述这个变量表示什么)  
	*/ 
	private static final long serialVersionUID = 1L;
	
	/**
     * 所处城市
     */
	protected String city;
	
	/**
	 * 所属公司 的编码
	 */
	protected String company;

	

	public void setCity(String city) {
		this.city = city;
	}

	

	public void setCompany(String company) {
		this.company = company;
	}
	
	
	
	

}
