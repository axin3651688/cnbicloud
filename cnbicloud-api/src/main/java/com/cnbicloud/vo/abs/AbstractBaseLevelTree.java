package com.cnbicloud.vo.abs;

import javax.persistence.MappedSuperclass;

/**
* @ClassName: com.cnbicloud.vo.base.CommonBean  
* @Description: TODO(这里用一句话描述这个类的作用)  
* @author 龚佳新 
* @date 2017年11月29日  
*
 */
@MappedSuperclass
public abstract class AbstractBaseLevelTree extends AbstractBase {

	private static final long serialVersionUID = 1L;

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
		

	public String getPid() {
		return pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}
	
}
