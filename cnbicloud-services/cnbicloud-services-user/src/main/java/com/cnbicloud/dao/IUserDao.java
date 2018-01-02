package com.cnbicloud.dao;

import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.cnbicloud.dao.CnbiJpaRepository;
import com.cnbicloud.vo.per.T_User;


/**
 * 
* @ClassName: IUserDao  
* @Description: TODO(用户dao接口)  
* @author 龚佳新 
* @date 2017年12月18日  
*
 */
@Repository("userDao")
public interface IUserDao extends CnbiJpaRepository<T_User,Long> {

	public T_User findByUsername(String username);
    
	Optional<T_User> findOneByUsername(String username);
	
	Optional<T_User> findOneByPhone(String phone);
	
	Optional<T_User> findOneByEmail(String email);

}
