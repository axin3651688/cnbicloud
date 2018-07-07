package com.cnbicloud.dao;

import java.util.List;

import com.cnbicloud.vo.log.Log_Login;

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
	* @Title: findByCreateUser  
	* @Description: TODO(这里用一句话描述这个方法的作用)  
	* @param @param userId
	* @param @return    参数  
	* @return Page<Log_Login>    返回类型  
	* @throws
	 */
	public List<Log_Login> findByCreateUser(Long userId);

}