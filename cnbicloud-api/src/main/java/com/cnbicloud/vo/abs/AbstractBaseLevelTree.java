package com.cnbicloud.vo.abs;

import java.io.Serializable;
/**
 * 
* @ClassName: com.cnbicloud.vo.base.CommonBean  
* @Description: TODO(这里用一句话描述这个类的作用)  
* @author 龚佳新 
* @date 2017年11月29日  
*
 */
public abstract class AbstractBaseLevelTree implements Serializable {

	private static final long serialVersionUID = 1L;
	/**
	 * 编码
	 */
	public String id;
	/**
	 * 名称[简称]
	 */
	public String text;
	
	/**
	 * 父编码
	 */
	public String pid;
	
	

	/**
	 * 父编码
	 */
	public AbstractBaseLevelTree() {}
	
	public AbstractBaseLevelTree(String id, String text) {
		this.id = id;
		this.text = text;
	}
	
	
	public AbstractBaseLevelTree(String id, String text, String pid){
		this(id, text);
		this.pid = pid;
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

	public String getPid() {
		return pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}
	
}
