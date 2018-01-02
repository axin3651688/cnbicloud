package com.cnbicloud.vo.org;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import com.cnbicloud.vo.abs.AbstractBaseLevelTree;
/**
 * 
* @ClassName: T_Industry_Param  
* @Description: TODO(行业参数表)  
* @author 龚佳新 
* @date 2017年12月8日  
*
 */
@Table
@Entity(name = "dim_industry_param")
public class T_IndustryParam extends AbstractBaseLevelTree {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5496223876326578962L;
	
	
	

	@Column(length=4)
	private String unit;
	
	/**
	 * 取代之前数据库的cflag列，y->1表示按期间变化的,n->表示不按期间变化 的
	 */
	private Short typ;
	
	/**
	 * 行业参数肯定是属于某个行业的
	 */
	@ManyToOne( cascade = { CascadeType.ALL},optional = true,fetch = FetchType.LAZY)
	@JoinColumn(unique = false, nullable = true, updatable = false)
	private T_Industry industry;

	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}



	public String getPid() {
		return pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	

	public Short getTyp() {
		return typ;
	}

	public void setTyp(Short typ) {
		this.typ = typ;
	}

	public T_Industry getIndustry() {
		return industry;
	}

	public void setIndustry(T_Industry industry) {
		this.industry = industry;
	}
	
	

}
