package com.cnbicloud.api.auth;
import java.io.Serializable;
/**
 * 
 * @ClassName: T_Source
 * @Description: TODO(动作权限表)
 * @author 龚佳新
 * @date 2017年12月8日
 *
 */
public class Auth_Action implements Serializable {

	private static final long serialVersionUID = 1L;
    
	private Long id;
	/**
	 * 编码:【per,insert,delete,update,select,export,import,】
	 */
	public String code;
	
	/**
	 * 资源编码
	 */
	public String sourceId;
    
	/**
	 * 动作名称
	 */
	public String text;
	
	
	

	public Auth_Action() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Auth_Action(Long id, String code, String text) {
		super();
		this.id = id;
		this.code = code;
		this.text = text;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	
	

}
