package com.cnbicloud.vo.log;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
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
public class Log_Login extends com.cnbicloud.api.log.Log_Login {

	/**  
	* @Fields field:{todo}(用一句话描述这个变量表示什么)  
	*/ 
	private static final long serialVersionUID = 1L;
	
	@Column(nullable = false)
	public Long getCreateUser() {
		return createUser;
	}
	@Column(length = 32)
	public String getPlatfrom() {
		return platfrom;
	}
	@Column(length = 25)
	public String getBrand() {
		return brand;
	}

	public String getCity() {
		return city;
	}
   
	@Column(length = 36)
	public String getCode() {
		return code;
	}
	@Column(length = 32)
	public String getHost() {
		return host;
	}

	@Column(length = 25)
	public String getStatus() {
		return status;
	}

    
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	public Long getId() {
		return id;
	}
   
	@Column(nullable = false)
	public Long getCreateTime() {
		return createTime;
	}
	@Column(nullable = false,length = 36)
	public String getTableName() {
		return tableName;
	}
   
	@Lob
	@Basic(fetch = FetchType.LAZY)
	@Column(name = "sdesc", nullable = true)
	public String getDes() {
		return des;
	}
	@Column(name="nprimary_id",nullable = false)
	public Long getPrimaryId() {
		return primaryId;
	}
	@Column(nullable = false)
	public Short getLev() {
		return lev;
	}
	
	

}
