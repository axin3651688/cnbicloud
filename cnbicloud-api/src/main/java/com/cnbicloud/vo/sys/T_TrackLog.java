package com.cnbicloud.vo.sys;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @ClassName: T_TrackLog
 * @Description: TODO(轨迹日志数据)
 * @author 龚佳新
 * @date 2017年11月29日
 *
 */
public class T_TrackLog implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * 主键
	 */
	private Long id;

	/**
	 * 创建时间
	 */
	private Date createTime;

	/**
	 * 创建者
	 */
	private Long createUser;

	/**
	 * webbrowser,android,ios,ipad 设备平台类型
	 */
	private String platfrom;

	/**
	 * 设备品牌[小米,华为,三星...]
	 */
	private String brand;

	/**
	 * 设备唯一标识
	 */
	private String code;

	/**
	 * 访问主机ip
	 */
	private String host;

	/**
	 * 关联表
	 */
	private String tableName;

	/**
	 * 关联表的主键
	 */
	private String relation;

	/**
	 * 动作，权限[find:查看，update:修改，add:新增，del:删除，upload:上传，download:下载，export:导出],根据此属性可以分7张表存合理些，考虑到数据的动态爆炸性增长
	 */
	public int act;

	/**
	 * 级别【1:info,2:warn,3:error】
	 */
	public int lev;

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

	public Long getCreateUser() {
		return createUser;
	}

	public void setCreateUser(Long createUser) {
		this.createUser = createUser;
	}

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

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public String getRelation() {
		return relation;
	}

	public void setRelation(String relation) {
		this.relation = relation;
	}

	public int getAct() {
		return act;
	}

	public void setAct(int act) {
		this.act = act;
	}

	public int getLev() {
		return lev;
	}

	public void setLev(int lev) {
		this.lev = lev;
	}

}
