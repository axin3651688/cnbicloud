package com.cnbicloud.api.base.tree;

import com.cnbicloud.api.base.abs.AbstractBaseLevelTree;

/**
 * @ClassName: LevelBean
 * @Description: TODO(具体级别属性的属性基类)
 * @author 龚佳新
 * @date 2017年10月30日
 * {id,enabled,avatar,code,text,pid,lev,leaf,des}
 */
public abstract class TreeBean extends AbstractBaseLevelTree {

	/**
	 * @Fields field:{todo}(用一句话描述这个变量表示什么)
	 */
	private static final long serialVersionUID = -5545905659600391924L;
	/*
	 * 级别
	 */
	public Short lev;
	/**
	 * 是否为叶子
	 */
	public Short leaf;

	/**
	 * 是否禁用或是否锁住
	 */
	//public Short enabled;
	

	//private String avatar;

	private String des;

	public TreeBean() {}

	

	public Short getLev() {
		return lev;
	}



	public void setLev(Short lev) {
		this.lev = lev;
	}



	public Short getLeaf() {
		return leaf;
	}



	public void setLeaf(Short leaf) {
		this.leaf = leaf;
	}
	

	public String getDes() {
		return des;
	}

	public void setDesc(String des) {
		this.des = des;
	}
	
	

}
