package com.cnbicloud.vo.abs;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
/**
 * 
 * @ClassName: T_TrackLog
 * @Description: TODO(轨迹日志数据,此表数据量大，故设计为分库保存)
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
	private String des;

	/**
	 * 关联表的主键
	 */
	@Column(length = 32)
	private String relation;

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

	public String getRelation() {
		return relation;
	}

	public void setRelation(String relation) {
		this.relation = relation;
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

	
	
	

}
