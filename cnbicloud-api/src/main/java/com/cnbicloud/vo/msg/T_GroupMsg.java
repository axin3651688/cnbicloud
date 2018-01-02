package com.cnbicloud.vo.msg;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import com.cnbicloud.vo.abs.BaseMsg;
import com.cnbicloud.vo.per.T_Group;
@Entity
@Table(name = "msg_group")
public class T_GroupMsg extends BaseMsg {

	/**  
	* @Fields field:{todo}(用一句话描述这个变量表示什么)  
	*/ 
	private static final long serialVersionUID = 4918931799644976278L;
	

	/**
	 * 接收者
	 */
	//@JoinColumn(name = "togroupid")
	@ManyToOne(cascade = {CascadeType.ALL}, optional = true,fetch = FetchType.LAZY)
	private T_Group receiver;


	public T_Group getReceiver() {
		return receiver;
	}


	public void setReceiver(T_Group receiver) {
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
