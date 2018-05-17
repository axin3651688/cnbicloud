package com.cnbicloud.api.base.log;
import java.io.Serializable;
/**
 * 
 * @ClassName: T_TrackLog
 * @Description: TODO(轨迹日志数据,此表数据量大，故在此设计为分表分库保存，理论上讲轨迹数据不应该持久化到关系型数据库里边的)
 * @author 龚佳新
 * @date 2017年11月29日
 *
 */
public  class LogBean  extends TrackLogBean implements Serializable {
	/**  
	* @Fields field:{todo}(用一句话描述这个变量表示什么)  
	*/ 
	private static final long serialVersionUID = 1L;
	protected Long login;


	public Long getLogin() {
		return login;
	}


	public void setLogin(Long login) {
		this.login = login;
	}
}
