package com.cnbicloud.dao;

import org.springframework.stereotype.Repository;

import com.cnbicloud.vo.T_Company;

@Repository
public interface ICompanyDao extends CnbiJpaRepository<T_Company,String> {

}
