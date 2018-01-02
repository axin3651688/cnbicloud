package com.cnbicloud.vo.msg;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import com.cnbicloud.vo.abs.BaseMsg;
import com.cnbicloud.vo.sys.T_Source;
/**
 * 
* @ClassName: T_AppMsg  
* @Description: TODO(应用机器人)  
* @author 龚佳新 
* @date 2017年12月8日  
*
 */
@Entity
@Table(name = "msg_app")
public class T_AppMsg extends BaseMsg {

	/**  
	* @Fields field:{todo}(用一句话描述这个变量表示什么)  
	*/ 
	private static final long serialVersionUID = 8289118424886659144L;
	

	/**
	 * 接收者：
	 */
	@ManyToOne(cascade = {CascadeType.ALL}, optional = true,fetch = FetchType.LAZY)
	private T_Source receiver;


	public T_Source getReceiver() {
		return receiver;
	}


	public void setReceiver(T_Source receiver) {
		this.receiver = receiver;
	}
	
	
	@Column(name = "receiver_id", unique = false, nullable = true, insertable = false, updatable = false)
	private String to;


	public String getTo() {
		return to;
	}


	public void setTo(String to) {
		this.to = to;
	}
	
	
	

}
