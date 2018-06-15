package com.cnbicloud.vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * @ClassName: T_User
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author 龚佳新
 * @date 2018年3月23日
 *
 */
@Table
@Entity(name = "core_source")
public class T_Source extends com.cnbicloud.api.core.T_Source {

	/**
	 * @Fields field:{todo}(用一句话描述这个变量表示什么)
	 */
	private static final long serialVersionUID = 1L;
	
	
	
	
	public Short getLeaf() {
		return leaf;
	}
	
	public Short getLev() {
		return lev;
	}
	

	public String getDes() {
		return des;
	}
	
	
	
	
	

}
