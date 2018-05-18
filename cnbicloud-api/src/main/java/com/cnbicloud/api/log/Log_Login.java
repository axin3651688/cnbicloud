package com.cnbicloud.api.log;

import com.cnbicloud.api.base.log.TrackLogBean;

/**
 * 
 * @ClassName: T_TrackLog
 * @Description: TODO(轨迹日志数据,此表数据量大，故设计为分库保存)
 * @author 龚佳新
 * @date 2017年11月29日
 *
 */
public class Log_Login extends TrackLogBean {

	/**  
	* @Fields field:{todo}(用一句话描述这个变量表示什么)  
	*/ 
	private static final long serialVersionUID = 1L;
	
	/**
	 * 操作用户
	 */
	protected Long createUser;
	
	/**
	 * webbrowser,android,ios,ipad 设备平台类型
	 */
	protected String platfrom;

	/**
	 * 设备品牌[小米,华为,三星...]
	 */
	protected String brand;
	
	/**
	 * 操作地点,这个参数是通过一个第三方的API算出来的
	 */
	protected String city;

	/**
	 * 设备唯一标识
	 */
	protected String code;

	/**
	 * 访问主机ip
	 */
	protected String host;
	
	/**
	 * 状态【online：在线,outline:离线，hide：隐身】
	 * 如果下线，还要更新此表状态为outline
	 */
	protected String status;
	
	public Log_Login() {}

	public void setCreateUser(Long createUser) {
		this.createUser = createUser;
	}

	public void setPlatfrom(String platfrom) {
		this.platfrom = platfrom;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Long getCreateUser() {
		return createUser;
	}

	public String getPlatfrom() {
		return platfrom;
	}

	public String getBrand() {
		return brand;
	}

	public String getCity() {
		return city;
	}

	public String getCode() {
		return code;
	}

	public String getHost() {
		return host;
	}

	public String getStatus() {
		return status;
	}
	
	
}
