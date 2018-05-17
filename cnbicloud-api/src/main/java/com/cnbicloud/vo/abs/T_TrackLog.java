package com.cnbicloud.vo.abs;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
/**
 * 
 * @ClassName: T_TrackLog
 * @Description: TODO(轨迹日志数据,此表数据量大，故在此设计为分表分库保存，理论上讲轨迹数据不应该持久化到关系型数据库里边的)
 * @author 龚佳新
 * @date 2017年11月29日
 *
 */
@MappedSuperclass
public abstract class T_TrackLog implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 主键
	 */
	@Id
	private Long id;

	/**
	 * 操作时间
	 */
	private Date createTime;

	/**
	 * 关联表
	 */
	private String tableName;
	
	@Column(length = 255)
	private String des;//

	/**
	 * 关联表的主键,这一定是一个Long类型
	 */
	private Long primaryId;

	/**
	 * 动作，权限[select:查看，update:修改，insert:新增，delete:删除，upload:上传，download:下载，export:导出],根据此属性可以分7张表存合理些，考虑到数据的动态爆炸性增长
	 */
	//public String act;

	/**
	 * 级别【1:info,2:warn,3:error】
	 */
	public Short lev;
	

	public T_TrackLog() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	

	
	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}


	public Short getLev() {
		return lev;
	}

	public void setLev(Short lev) {
		this.lev = lev;
	}

	public String getDes() {
		return des;
	}

	public void setDes(String des) {
		this.des = des;
	}

	public Long getPrimaryId() {
		return primaryId;
	}

	public void setPrimaryId(Long primaryId) {
		this.primaryId = primaryId;
	}

	
	
	

}
