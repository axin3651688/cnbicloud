package com.cnbicloud.api.base.abs;
/**
 * 
* @ClassName: AbstractBaseLevelTree  
* @Description: TODO(这里用一句话描述这个类的作用)  
* @author 龚佳新 
* @date 2018年5月3日  
* {id,enabled,avatar,code,text,pid}
 */
public class AbstractBaseLevelTree extends AbstractBase {
	
	private static final long serialVersionUID = 1L;

	/**
	 * 父编码
	 */
	public String spcode;
	
	/**
	 * 父编码
	 */
	public AbstractBaseLevelTree() {}
	
	public AbstractBaseLevelTree(String code, String text) {
		this.code = code;
		this.text = text;
	}

	public String getSpcode() {
		return spcode;
	}

	public void setSpcode(String spcode) {
		this.spcode = spcode;
	}
	
   

}
