package com.cnbicloud.dao;

import org.springframework.data.domain.Page;

import com.cnbicloud.vo.log.Log_Login;;

/**
 * 
* @ClassName: ILogDao  
* @Description: TODO(日志DAO)  
* @author 龚佳新 
* @date 2018年6月5日  
*
 */
public interface ILogDao extends CnbiJpaRepository<Log_Login,Long> {
	
	/**
	 * 查询用户的登录记录
	* @Title: findPageByCreateUser  
	* @Description: TODO(这里用一句话描述这个方法的作用)  
	* @param @param userId
	* @param @return    参数  
	* @return Page<Log_Login>    返回类型  
	* @throws
	 */
	public Page<Log_Login> findPageByCreateUser(Long userId);

}
