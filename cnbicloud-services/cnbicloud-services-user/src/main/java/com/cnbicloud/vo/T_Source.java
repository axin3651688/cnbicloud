package com.cnbicloud.vo;
import javax.persistence.Column;
import javax.persistence.Entity;
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
	
	
	
	@Column(nullable = false,length=1)
	public Short getLeaf() {
		return leaf;
	}
	@Column(nullable = false,length=1)
	public Short getLev() {
		return lev;
	}
	
	@Column(nullable = false,length=255)
	public String getDes() {
		return des;
	}
	
	
	
	
	

}
