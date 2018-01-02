package com.cnbicloud.vo.region;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.cnbicloud.vo.abs.AbstractBase;
@Entity
@Table(name = "r_city")
public class R_City extends AbstractBase {

	/**  
	* @Fields field:{todo}(用一句话描述这个变量表示什么)  
	*/ 
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "id",length = 8)
	private String id;
	
	
	@ManyToOne( cascade = { CascadeType.ALL},optional = true,fetch = FetchType.LAZY)
	@JoinColumn(unique = false, nullable = true, updatable = false)
	private R_Province province;

}
