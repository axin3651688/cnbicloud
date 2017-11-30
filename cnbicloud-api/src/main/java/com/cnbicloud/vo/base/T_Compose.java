package com.cnbicloud.vo.base;

import java.io.Serializable;

/**
 * 
* @ClassName: T_Compose  
* @Description: TODO(关系表)  
* @author 龚佳新 
* @date 2017年11月29日  
*
 */
@SuppressWarnings("serial")
public class T_Compose implements Serializable {
	
	private Integer id;
	/**
	 * 字段名称
	 */
	private String field;
	/**
	 * 表名称
	 */
	private String tableName;
	
	/**
	 * 表名称描述
	 */
	private String text;
	
	/**
	 * 类型[sys：系统表,app：应用表]
	 */
	private String type;
	
	public T_Compose() {}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	
	
}


