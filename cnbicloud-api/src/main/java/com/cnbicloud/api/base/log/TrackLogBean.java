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
public abstract class TrackLogBean implements Serializable {

	private static final long serialVersionUID = 1L;

	protected Long id;

	/**
	 * 操作时间
	 */
	protected Long createTime;

	/**
	 * 关联表
	 */
	protected String tableName;

	/**
	 * 描述
	 */
	protected String des;//

	/**
	 * 关联表的主键,这一定是一个Long类型, 这就要求了此平台所有的表的主键必须为主键，可能有些人要讲了，以前公司，部门级别这种实体都是code的String类型的，我只是想说，加Long类型的主键一样完善兼容，只不过code加个unique就Ok了
	 */
	protected Long primaryId;

	/**
	 * 动作，权限[select:查看，update:修改，insert:新增，delete:删除，upload:上传，download:下载，export:导出],根据此属性可以分7张表存合理些，考虑到数据的动态爆炸性增长
	 */
	// public String act;

	/**
	 * 级别【1:info,2:warn,3:error】
	 */
	public Short lev;

	public TrackLogBean() {}

	public TrackLogBean(Long id, Long createTime, String tableName, String des, Long primaryId, Short lev) {
		super();
		this.id = id;
		this.createTime = createTime;
		this.tableName = tableName;
		this.des = des;
		this.primaryId = primaryId;
		this.lev = lev;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setCreateTime(Long createTime) {
		this.createTime = createTime;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public void setDes(String des) {
		this.des = des;
	}

	public void setPrimaryId(Long primaryId) {
		this.primaryId = primaryId;
	}

	public void setLev(Short lev) {
		this.lev = lev;
	}

	public Long getId() {
		return id;
	}

	public Long getCreateTime() {
		return createTime;
	}

	public String getTableName() {
		return tableName;
	}

	public String getDes() {
		return des;
	}

	public Long getPrimaryId() {
		return primaryId;
	}

	public Short getLev() {
		return lev;
	}
	
	//////////////////////////
	
   
}
