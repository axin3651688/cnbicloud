package com.cnbicloud.vo.log;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.cnbicloud.vo.abs.T_TrackLog;
import com.cnbicloud.vo.per.T_User;
import com.cnbicloud.vo.region.R_City;

/**
 * 
 * @ClassName: T_TrackLog
 * @Description: TODO(轨迹日志数据,此表数据量大，故设计为分库保存)
 * @author 龚佳新
 * @date 2017年11月29日
 *
 */
@Entity
@Table(name = "log_login")
public class T_LoginLog extends T_TrackLog {

	/**  
	* @Fields field:{todo}(用一句话描述这个变量表示什么)  
	*/ 
	private static final long serialVersionUID = 1L;
	
	/**
	 * 操作用户
	 */
	@ManyToOne( cascade = { CascadeType.ALL},optional = true,fetch = FetchType.LAZY)
	@JoinColumn(unique = false, nullable = true, updatable = false)
	private T_User createUser;
	
	/**
	 * webbrowser,android,ios,ipad 设备平台类型
	 */
	@Column(length = 32)
	private String platfrom;

	/**
	 * 设备品牌[小米,华为,三星...]
	 */
	@Column(length = 25)
	private String brand;
	
	/**
	 * 操作地点,这个参数是通过一个第三方的API算出来的
	 */
	@ManyToOne( cascade = { CascadeType.ALL},optional = true,fetch = FetchType.LAZY)
	@JoinColumn(unique = false, nullable = true, updatable = false)
	private R_City city;

	/**
	 * 设备唯一标识
	 */
	@Column(length = 36)
	private String code;

	/**
	 * 访问主机ip
	 */
	@Column(length = 32)
	private String host;
	
	/**
	 * 状态【online：在线,outline:离线，hide：隐身】
	 * 如果下线，还要更新此表状态为outline
	 */
	@Column(length = 25)
	private String status;
	
	public T_LoginLog() {}

	public String getPlatfrom() {
		return platfrom;
	}

	public void setPlatfrom(String platfrom) {
		this.platfrom = platfrom;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public R_City getCity() {
		return city;
	}

	public void setCity(R_City city) {
		this.city = city;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}
	
	
	public T_User getCreateUser() {
		return createUser;
	}

	public void setCreateUser(T_User createUser) {
		this.createUser = createUser;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	
	

}
