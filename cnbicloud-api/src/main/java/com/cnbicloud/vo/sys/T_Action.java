package com.cnbicloud.vo.sys;
import javax.persistence.Entity;
import javax.persistence.Table;
import com.cnbicloud.vo.abs.AbstractBase;
/**
 * 
* @ClassName: T_Source  
* @Description: TODO(资源菜单表)  
* @author 龚佳新 
* @date 2017年12月8日  
*
 */
@Entity
@Table(name = "sys_action")
public class T_Action extends AbstractBase {

	private static final long serialVersionUID = 1L;
	
	
	public T_Action(String id,String text) {
           super(id, text);		
	}

	
	

}
