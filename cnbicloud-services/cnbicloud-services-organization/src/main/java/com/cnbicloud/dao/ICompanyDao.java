package com.cnbicloud.dao;

import org.springframework.stereotype.Repository;

import com.cnbicloud.vo.T_Company;
/**
 * 
* @ClassName: ICompanyDao  
* @Description: TODO(公司Dao接口)  
* @author 龚佳新 
* @date 2018年7月11日  
*
 */
@Repository
public interface ICompanyDao extends CnbiJpaRepository<T_Company,String> {

}
