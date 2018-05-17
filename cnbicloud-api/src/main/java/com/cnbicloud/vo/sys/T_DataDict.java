package com.cnbicloud.vo.sys;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import com.cnbicloud.vo.abs.AbstractBaseLevelTree;
/**
 * 
* @ClassName: T_DataDict  
* @Description: TODO(数据字典)  
* @author 龚佳新 
* @date 2017年11月29日  
*
 */

@Entity
@Table(name = "dict_data")
public class T_DataDict extends AbstractBaseLevelTree {

	private static final long serialVersionUID = 1L;
	
	/**
	 * 值
	 */
	@Column(length = 24)
	private String val;
	
	public T_DataDict(String id,String text,String val) {
		super();
		this.val = val;
	}

	public String getValue() {
		return val;
	}

	public void setVal(String val) {
		this.val = val;
	}
	
	

}
