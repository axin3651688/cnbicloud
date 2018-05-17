package com.cnbicloud.vo.log;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
/**
 * 
 * @ClassName: T_updateLog
 * @Description: TODO(轨迹日志数据,此表数据量大，故设计为分库保存)
 * @author 龚佳新
 * @date 2017年11月29日
 *
 */
@Entity
@Table(name = "log_update")
public class T_UpdateLog extends com.cnbicloud.api.log.T_UpdateLog {
	
	private static final long serialVersionUID = 1L;
	
	@Column(nullable = false)
	public Long getLogin() {
		return login;
	}

}