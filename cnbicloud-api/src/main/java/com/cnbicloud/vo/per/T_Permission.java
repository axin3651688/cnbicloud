package com.cnbicloud.vo.per;
/**
 * 
* @ClassName: T_Permission  
* @Description: TODO(这里用一句话描述这个类的作用)  
* @author 龚佳新 
* @date 2017年11月30日  
*
 */
public class T_Permission {
	
	
	private Integer id;
	
	/**
	 * 权限编码 [find:查看，update:修改，add:新增，del:删除，upload:上传，download:下载，export:导出]
	 */
	private String code;
	
	/**
	 * 权限名称
	 */
	private String text;
	
	public T_Permission() {}

	public T_Permission(Integer id,String code,String text) {
		super();
		this.id = id;
		this.code = code;
		this.text = text;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	
	
	

}
