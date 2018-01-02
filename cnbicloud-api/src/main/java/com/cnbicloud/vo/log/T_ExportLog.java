package com.cnbicloud.vo.log;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.cnbicloud.vo.abs.T_TrackLog;

/**
 * 
 * @ClassName: T_exportLog
 * @Description: TODO(轨迹日志数据,此表数据量大，故设计为分库保存)
 * @author 龚佳新
 * @date 2017年11月29日
 *
 */
@Entity
@Table(name = "log_export")
public class T_ExportLog extends T_TrackLog {

	/**  
	* @Fields field:{todo}(用一句话描述这个变量表示什么)  
	*/ 
	private static final long serialVersionUID = 1L;

	
	@ManyToOne( cascade = { CascadeType.ALL},optional = true,fetch = FetchType.LAZY)
	@JoinColumn(unique = false, nullable = true, updatable = false)
	private T_LoginLog login;
	public T_LoginLog getLogin() {
		return login;
	}


	public void setLogin(T_LoginLog login) {
		this.login = login;
	}
}
