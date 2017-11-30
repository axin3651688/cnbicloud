package com.cnbicloud.vo.base;

import com.cnbicloud.vo.abs.TreeBean;

/**
 * 
* @ClassName: T_DataDict  
* @Description: TODO(数据字典)  
* @author 龚佳新 
* @date 2017年11月29日  
*
 */
public class T_DataDict extends TreeBean {

	private static final long serialVersionUID = 1L;
	
	/**
	 * 值
	 */
	private String value;
	
	public T_DataDict(String id,String text,String value) {
		super();
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	

}
