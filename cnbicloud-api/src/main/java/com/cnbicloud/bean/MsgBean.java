package com.cnbicloud.bean;

import java.io.Serializable;

/**
 * 
* @ClassName: MsgBean  
* @Description: TODO(返回数据的统一数据格式)  
* @author 龚佳新 
* @date 2018年6月5日  
*
 */
public class MsgBean implements Serializable{
	
	/**  
	* @Fields field:{todo}(用一句话描述这个变量表示什么)  
	*/ 
	private static final long serialVersionUID = 1L;

	private int code;
	
	private String msg;
	
	private Object datas;
	
	public MsgBean(Object datas) {
		super();
		this.code = 200;
		this.msg = "执行成功！";
		this.datas = datas;
	}
	public MsgBean(int code, String msg, Object datas) {
		super();
		this.code = code;
		this.msg = msg;
		this.datas = datas;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Object getDatas() {
		return datas;
	}

	public void setDatas(Object datas) {
		this.datas = datas;
	}
	
	  

}
