package com.cnbicloud.vo.log;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
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
public class T_DownloadLog extends com.cnbicloud.api.log.T_DownloadLog {
	
	private static final long serialVersionUID = 1L;
	
	@Column(nullable = false)
	public Long getLogin() {
		return login;
	}

}
