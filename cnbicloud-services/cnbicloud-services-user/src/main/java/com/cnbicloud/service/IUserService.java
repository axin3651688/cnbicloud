package com.cnbicloud.service;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cnbicloud.dao.IUserDao;
import com.cnbicloud.vo.T_User;
/**
 * 
* @ClassName: IUserService  
* @Description: TODO(用户service)  
* @author 龚佳新 
* @date 2017年12月18日  
*
 */
@Service("userService")
public class IUserService {

	@Autowired
	private IUserDao dao;
	
	/**
	* @Title: findByUsername  
	* @Description: TODO(根据用户名称查询用户对象)  
	* @param @param username
	* @param @return    参数  
	* @return T_User    返回类型  
	* @throws
	 */
	public T_User findByUsername(String username){
		 Optional<T_User>   option =   dao.findOneByUsername(username);
		 return option.get();
	}
	
	
	public Optional<T_User> findOneByUsername(String username){
		Optional<T_User> option =   dao.findOneByUsername(username);
		return option;
	}
	
	
	/**
	 * 
	* @Title: findOneByPhone  
	* @Description: TODO(根据用户名称查询用户对象)  
	* @param @param phone
	* @param @return    参数  
	* @return Optional<T_User>    返回类型  
	* @throws
	 */
	public Optional<T_User> findOneByPhone(String phone){
		Optional<T_User> option =   dao.findOneByPhone(phone);
		return option;
	}
	
	/**
	 * 
	* @Title: findOneByEmail  
	* @Description: TODO(根据邮件查询用户)  
	* @param @param email
	* @param @return    参数  
	* @return Optional<T_User>    返回类型  
	* @throws
	 */
	public Optional<T_User> findOneByEmail(String email){
		Optional<T_User> option =   dao.findOneByEmail(email);
		return option;
	}
	
	/**
	 * 
	* @Title: delete  
	* @Description: TODO(按id删除)  
	* @param @param id    参数  
	* @return void    返回类型  
	* @throws
	 */
	public void deleteById(Long id) {
		dao.delete(id);
	}
	/**
	 * 
	* @Title: findOne  
	* @Description: TODO(按id查询)  
	* @param @param id
	* @param @return    参数  
	* @return T_User    返回类型  
	* @throws
	 */
	public T_User findById(Long id) {
		return dao.findOne(id);
	}
	
	/**
	 * 
	* @Title: save  
	* @Description: TODO(保存用户)  
	* @param @param user
	* @param @return    参数  
	* @return T_User    返回类型  
	* @throws
	 */
	public T_User save(T_User user) {
		return dao.save(user);
	}
}
