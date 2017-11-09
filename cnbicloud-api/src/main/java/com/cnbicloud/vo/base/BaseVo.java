package com.cnbicloud.vo.base;

import java.io.Serializable;

/**
 * 
 * @ClassName: BaseVo
 * @Description: TODO(实体的基类)
 * @author 龚佳新
 * @date 2017年10月30日
 *
 */
public abstract class BaseVo implements Serializable {

	private static final long serialVersionUID = 1L;

	private String id;

	private String text;

	private String pid;

	private int level;

	private int leaf;
	
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

	public String getPid() {
		return pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getLeaf() {
		return leaf;
	}

	public void setLeaf(int leaf) {
		this.leaf = leaf;
	}


}
