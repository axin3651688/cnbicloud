package com.cnbicloud.vo.sys;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
* @ClassName: T_Compose  
* @Description: TODO(关系表)  
* @author 龚佳新 
* @date 2017年11月29日  
*
 */
@Entity
@Table(name = "dict_compose")
public class T_Compose implements Serializable {
	
	/**  
	* @Fields field:{todo}(用一句话描述这个变量表示什么)  
	*/ 
	private static final long serialVersionUID = 1298563973277562239L;
	@Id
	private Integer id;
	/**
	 * 字段名称
	 */
	@Column(length = 32)
	private String field;
	/**
	 * 表名称
	 */
	@Column(length = 32)
	private String tableName;
	
	/**
	 * 表名称描述
	 */
	@Column(length = 28)
	private String text;
	
	/**
	 * 类型[sys：系统表,app：应用表]
	 */
	@Column(length = 16)
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


