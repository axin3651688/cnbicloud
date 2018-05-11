package com.cnbicloud.vo.sys;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import com.cnbicloud.vo.abs.TreeBean;
/**
 * 
* @ClassName: T_Source  
* @Description: TODO(系统菜单资源表)  
* @author 龚佳新 
* @date 2017年12月8日  
*
 */
@Entity
@Table(name = "sys_source")
public class T_Source extends TreeBean {

	private static final long serialVersionUID = 1L;
	
	/**
	 * 值
	 */
	@Column(length = 150)
	private String val;
	
	
	
	public T_Source(String id,String text,String val) {
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
