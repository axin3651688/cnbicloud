
package com.cnbicloud.api.base.abs;

import com.cnbicloud.api.base.AbsEntity;
/**
 * 
* @ClassName: com.cnbicloud.vo.base.CommonBean  
* @Description: TODO(这里用一句话描述这个类的作用)  
* @author 龚佳新 
* @date 2017年11月29日  
*   {id,enabled,avatar,code,text}
 */
public abstract class AbstractBase extends AbsEntity {

	private static final long serialVersionUID = 1L;
	

		
	public String code;
	
	public String text;
	
	/**
	 * 父编码
	 */
	public AbstractBase() {}
	
	public AbstractBase(String code, String text) {
		this.code = code;
		this.text = text;
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
