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
 * @ClassName: T_downloadLog
 * @Description: TODO(轨迹日志数据,此表数据量大，故在此设计为分表分库保存，理论上讲轨迹数据不应该持久化到关系型数据库里边的)
 * @author 龚佳新
 * @date 2017年11月29日
 *
 */
@Entity
@Table(name = "log_download")
public class T_DownloadLog extends T_TrackLog {

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
