package com.cnbicloud.vo.abs;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
	
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "nid")
	protected Long id;
	
	
	/**
	 * 编码
	 */
	@Column(name = "id",length = 16,unique = true)
	public String code;
	/**
	 * 名称[简称]
	 */
	@Column(length = 32)
	public String text;
	
	/**
	 * 父编码
	 */
	public AbstractBase() {}
	
	public AbstractBase(String code, String text) {
		this.code = code;
		this.text = text;
	}
	
	

	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	
	
}
