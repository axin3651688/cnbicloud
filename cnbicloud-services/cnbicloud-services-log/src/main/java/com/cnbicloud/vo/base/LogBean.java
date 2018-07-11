package com.cnbicloud.vo.base;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.MappedSuperclass;
/**
 * 
* @ClassName: LogBean  
* @Description: TODO(日志基类)  
* @author 龚佳新 
* @date 2018年5月18日  
*
 */
@MappedSuperclass
public class LogBean extends  com.cnbicloud.api.base.log.LogBean{
	
	/**  
	* @Fields field:{todo}(用一句话描述这个变量表示什么)  
	*/ 
	private static final long serialVersionUID = 1L;
	
	@Column(nullable = false)
	public Long getLogin() {
		return login;
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
	@Column( nullable = true)
	public String getDes() {
		return des;
	}
	@Column(nullable = false)
	public Long getPrimaryId() {
		return primaryId;
	}
	@Column(nullable = false)
	public Short getLev() {
		return lev;
	}

}
