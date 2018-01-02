package com.cnbicloud.vo.per;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.cnbicloud.vo.sys.T_Action;
import com.cnbicloud.vo.sys.T_Source;
/**
* @ClassName: T_Permission  
* @Description: TODO(资源权限表)  
* @author 龚佳新 
* @date 2017年11月30日  
 */
@Entity
@Table(name = "sys_permissions")
public class T_Permission {
	
	/**
	 * 资源标识,返回动作与菜单的组成标识【insert:company】==>methodName:[insertCompany]
	 */
	@Id
	@Column(length = 32)
	private String id;
	
	/**
	 * 权限编动作[find:查看，update:修改，add:新增，del:删除，upload:上传，download:下载，export:导出]
	 */
	@ManyToOne( cascade = { CascadeType.ALL},optional = true,fetch = FetchType.LAZY)
	@JoinColumn(unique = false, nullable = true, updatable = false)
	private T_Action action ;
	
	/**
	 * 菜单编码或资源路径
	 */
	@ManyToOne( cascade = { CascadeType.ALL},optional = true,fetch = FetchType.LAZY)
	@JoinColumn(unique = false, nullable = true, updatable = false)
	private T_Source source;
	
	
	/**
	 * 类型[1:模块权限,2:资源权限]
	 */
	private Short typ;
		
	/**
	 * 权限名称【添加:公司】
	 */
	@Transient 
	private String text;
	
	
	
	
	public T_Permission() {}

	public T_Permission(String id,T_Action action,String text) {
		super();
		this.id = id;
		this.action = action;
		this.text = text;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	

	
	public T_Source getSource() {
		return source;
	}

	public void setSource(T_Source source) {
		this.source = source;
	}

	

	public T_Action getAction() {
		return action;
	}

	public void setAction(T_Action action) {
		this.action = action;
	}

	public Short getTyp() {
		return typ;
	}

	public void setTyp(Short typ) {
		this.typ = typ;
	}
	
	
	
	
	
	
	

}
