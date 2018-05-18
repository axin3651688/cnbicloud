package com.cnbicloud.api.core;
import com.cnbicloud.api.base.abs.AbstractBase;
/**
= * @ClassName: T_License  
 * @Description: TODO(牌照)  
 * @author 龚佳新 
 * @date 2017年12月7日  
 *
 */
public class T_License extends AbstractBase {

	
	private static final long serialVersionUID = 1L;
	
    /**
     * 动态根据规则生成的全局唯一编码
     */
	private String code;
	
	/**
	 * mode 模式 [1：开源，2：商业]
	 *  个人客户：按用户授权     1
	 *  企业客户:角色授权        2 
	 *       企业单帐套（无子公司的）21
	 *       企业多帐套（有子公司的）22
     *  混合客户:用户角色双授权  3  
	 */
	private Short mode;
	
	/**
	 * 【公司级别上限】
	 */
	private Short maxLevel;
	
	/**
	 * type 类型[1：个人(单帐套许可)，2：企业(多帐套许可)]
	 */
	private Short typ;
	
	/**
	 * 用户数量
	 */
	private Integer userCount;
	
	
	/**
	 * 授权方式0为角色授权，1为用户授权
	 */
	//@Column(name = "nauthorizationtype")
	//private int authorizationType;
	

	/**
	 * 是否启用 enable=0,禁用,对于商业帐套或非法帐套用户(攻击者或竞争者)有用的。 场景一：商业帐套
	 * 服务到期后，没有续费，系统自动对其禁用，并提前会推送信息告知用户 场景二：商业帐套和免费帐套【非法帐套用户(攻击者或竞争者)】
	 * 如发现大量重复登录信息或敏感操作，系统会对其做出评级(评级算法为CNBI-RRSA算法)，
	 * 如果评级为黑客或木马，系统自动对其禁用，并偿试获取攻击者的相关信息推送给经邦系统管理员，确认其行为后，做出人为的禁用与启用 enable=1启用
	 */
	private Short enabled;
	
	
	
	
	
	public T_License() {}



	public Short getTyp() {
		return typ;
	}





	public void setTyp(Short typ) {
		this.typ = typ;
	}





	public Integer getUserCount() {
		return userCount;
	}





	public void setUserCount(Integer userCount) {
		this.userCount = userCount;
	}





	public Short getEnabled() {
		return enabled;
	}





	public void setEnabled(Short enabled) {
		this.enabled = enabled;
	}





	public Short getMaxLevel() {
		return maxLevel;
	}





	public void setMaxLevel(Short maxLevel) {
		this.maxLevel = maxLevel;
	}



	public String getCode() {
		return code;
	}



	public void setCode(String code) {
		this.code = code;
	}



	public Short getMode() {
		return mode;
	}



	public void setMode(Short mode) {
		this.mode = mode;
	}
	
	
   
}
