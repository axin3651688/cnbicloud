package com.cnbicloud.vo.region;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.cnbicloud.vo.abs.AbstractBase;
@Entity
@Table(name = "r_country")
public class R_Country extends AbstractBase {

	/**  
	* @Fields field:{todo}(用一句话描述这个变量表示什么)  
	*/ 
	private static final long serialVersionUID = 5875595676492762165L;
	
	@Id
	@Column(name = "id", length = 8)
	private String id;

}
