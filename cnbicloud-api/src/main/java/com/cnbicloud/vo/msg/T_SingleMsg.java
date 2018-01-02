package com.cnbicloud.vo.msg;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.cnbicloud.vo.abs.BaseMsg;
import com.cnbicloud.vo.per.T_User;


@Entity
@Table(name = "msg_single")
public class T_SingleMsg extends BaseMsg {

	/**  
	* @Fields field:{todo}(用一句话描述这个变量表示什么)  
	*/ 
	private static final long serialVersionUID = 8289118424886659144L;
	

	/**
	 * 接收者：
	 */
	@ManyToOne(cascade = {CascadeType.ALL}, optional = true,fetch = FetchType.LAZY)
	private T_User receiver;


	public T_User getReceiver() {
		return receiver;
	}


	public void setReceiver(T_User receiver) {
		this.receiver = receiver;
	}
	
	
	@Column(name = "receiver_id", unique = false, nullable = true, insertable = false, updatable = false)
	private Long to;


	public Long getTo() {
		return to;
	}


	public void setTo(Long to) {
		this.to = to;
	}
	

}
