package com.cnbicloud.vo.abs;

/**
 * @ClassName: LevelBean
 * @Description: TODO(具体级别属性的属性基类)
 * @author 龚佳新
 * @date 2017年10月30日
 *
 */
public abstract class TreeBean extends AbstractBaseLevelTree {

	/**
	 * @Fields field:{todo}(用一句话描述这个变量表示什么)
	 */
	private static final long serialVersionUID = -5545905659600391924L;
	/*
	 * 级别
	 */
	public Integer lev;
	/**
	 * 是否为叶子
	 */
	public Integer leaf;

	/**
	 * 是否禁用或是否锁住
	 */
	public Integer enable;

	/**
	 * 头像或图标
	 */
	private String avatar;

	/**
	 * 描述
	 */
	private String desc;

	public TreeBean() {}

	public Integer getLev() {
		return lev;
	}

	public void setLev(Integer lev) {
		this.lev = lev;
	}

	public Integer getLeaf() {
		return leaf;
	}

	public void setLeaf(Integer leaf) {
		this.leaf = leaf;
	}

	public Integer getEnable() {
		return enable;
	}

	public void setEnable(Integer enable) {
		this.enable = enable;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	

}
