package com.cnbicloud.vo.abs;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
/**
 * 
* @ClassName: com.cnbicloud.vo.base.CommonBean  
* @Description: TODO(这里用一句话描述这个类的作用)  
* @author 龚佳新 
* @date 2017年11月29日  
*
 */
@MappedSuperclass
public abstract class AbstractBase implements Serializable {

	private static final long serialVersionUID = 1L;
	/**
	 * 编码
	 */
	@Id
	@Column(name = "id",length = 16)
	public String id;
	/**
	 * 名称[简称]
	 */
	@Column(length = 32)
	public String text;
	
	/**
	 * 父编码
	 */
	public AbstractBase() {}
	
	public AbstractBase(String id, String text) {
		this.id = id;
		this.text = text;
	}
	
	

	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	
	
}
